package com.example.geminiapi.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//currencyテーブルと1対1で対応する
@Entity
@Data
public class Currency {
	//自動採番ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//仮想通貨名
	private String name;
	
	//シンボル
	private String symbol;
	
	//数量
	private BigDecimal amount;
}
