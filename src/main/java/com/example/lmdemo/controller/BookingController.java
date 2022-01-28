package com.example.lmdemo.controller;

import com.example.lmdemo.repository.BookingRepository;
import com.example.lmdemo.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/all")
public class BookingController {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @RequestMapping(value= "/getAll")
    public List<Bookings> getHotels(){
        return bookingRepository.findAll();
    }
    @RequestMapping(value= "/set", method = RequestMethod.POST)
    public List<Bookings> create(@RequestBody Bookings hotelBooking){
        bookingRepository.save(hotelBooking);
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public List<Bookings> delete(@PathVariable long id){
        bookingRepository.deleteById(id);

        return bookingRepository.findAll();
    }
}
