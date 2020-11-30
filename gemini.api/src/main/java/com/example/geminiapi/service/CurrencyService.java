package com.example.geminiapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.geminiapi.domain.Currency;
import com.example.geminiapi.domain.CurrencyRepository;

import lombok.RequiredArgsConstructor;

//Repositoryを呼び出す、service層
@Service
@RequiredArgsConstructor
public class CurrencyService {
	private final CurrencyRepository currencyRepository;
	
	//currencyの全データを取得
	public List<Currency> findAll(){
		return currencyRepository.findAll();
	}
}
