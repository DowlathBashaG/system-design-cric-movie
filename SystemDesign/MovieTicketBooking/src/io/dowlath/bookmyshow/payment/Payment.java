package io.dowlath.bookmyshow.payment;

import java.util.Date;

import io.dowlath.bookmyshow.enums.PaymentStatus;

public class Payment {
	  private double amount;
	  private Date createdOn;
	  private int transactionId;
	  private PaymentStatus status;
}
