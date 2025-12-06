package com.kt.task_tracker.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tasks")

public class Task {

    private UUID id;


}
