package io.dowlath.bookmyshow.booking;

import java.util.Date;
import java.util.List;

import io.dowlath.bookmyshow.enums.BookingStatus;
import io.dowlath.bookmyshow.movie.Show;
import io.dowlath.bookmyshow.movie.ShowSeat;
import io.dowlath.bookmyshow.payment.Payment;

public class Booking {
	  private String bookingNumber;
	  private int numberOfSeats;
	  private Date createdOn;
	  private BookingStatus status;

	  private Show show;
	  private List<ShowSeat> seats;
	  private Payment payment;

	  /*
	   * Make payment for outstanding amount
	   */
	  public boolean makePayment(Payment payment) {
		  
	  }
	  
	  /**
	   * Cancel existing booking
	   * @return
	   */
	  public boolean cancel() {
		  
	  }
	  
	  /**
	   * @param seats
	   * allocate the seat.
	   * @return
	   */
	  public boolean assignSeats(List<ShowSeat> seats) {
		  
	  }

}
