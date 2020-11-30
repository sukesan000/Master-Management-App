package com.example.geminiapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geminiapi.domain.Currency;
import com.example.geminiapi.service.CurrencyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CurrencyController {
	private final CurrencyService currencyService;
	
	@GetMapping("/")
	public ResponseEntity<CurrencyResponse> findAll(){
		List<Currency> currencies = currencyService.findAll();
		CurrencyResponse currencyResponse = CurrencyResponse.builder().currencies(currencies).build();
		return new ResponseEntity<>(currencyResponse, HttpStatus.OK);
	}
}
