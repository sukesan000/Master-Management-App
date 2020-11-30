package com.example.geminiapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Entityを取得するインターフェース
@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long>{

}
