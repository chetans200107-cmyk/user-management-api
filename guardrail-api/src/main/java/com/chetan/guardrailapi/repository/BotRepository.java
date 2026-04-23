package com.chetan.guardrailapi.repository;

import com.chetan.guardrailapi.entity.Bot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BotRepository extends JpaRepository<Bot, Long> {
}