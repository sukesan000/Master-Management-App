package com.example.geminiapi.controller;

import java.util.List;

import com.example.geminiapi.domain.Currency;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CurrencyResponse {
	private List<Currency> currencies;
}
