package com.example.lmdemo.controller;

import com.example.lmdemo.repository.BookingRepository;
import com.example.lmdemo.model.Bookings;
import com.example.lmdemo.model.User;
import com.example.lmdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminBookingController {
    private BookingRepository bookingRepository;
    private UserRepository userRepository;


    @Autowired
    public AdminBookingController(BookingRepository bookingRepository, UserRepository userRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
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

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
