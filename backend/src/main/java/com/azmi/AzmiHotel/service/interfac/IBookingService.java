package com.azmi.AzmiHotel.service.interfac;

import com.azmi.AzmiHotel.dto.Response;
import com.azmi.AzmiHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
