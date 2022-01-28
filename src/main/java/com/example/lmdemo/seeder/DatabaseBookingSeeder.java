package com.example.lmdemo.seeder;

import com.example.lmdemo.repository.BookingRepository;
import com.example.lmdemo.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseBookingSeeder implements CommandLineRunner {

    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseBookingSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Bookings> bookings = new ArrayList<>();
        bookings.add(new Bookings("Marriot", 2, 200));
        bookings.add(new Bookings("PC", 5, 100));
        bookings.add(new Bookings("Shangra", 4, 500));

        bookingRepository.saveAll(bookings);
    }
}
