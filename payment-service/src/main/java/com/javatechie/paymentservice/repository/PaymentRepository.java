package com.javatechie.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.paymentservice.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	Payment findByOrderId(int orderId);

}
