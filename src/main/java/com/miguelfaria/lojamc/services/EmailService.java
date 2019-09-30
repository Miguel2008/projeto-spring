package com.miguelfaria.lojamc.services;

import org.springframework.mail.SimpleMailMessage;

import com.miguelfaria.lojamc.domain.Cliente;
import com.miguelfaria.lojamc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
