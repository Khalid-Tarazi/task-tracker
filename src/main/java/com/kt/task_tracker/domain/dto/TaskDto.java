package com.kt.task_tracker.domain.dto;

import com.kt.task_tracker.domain.entities.TaskPriority;
import com.kt.task_tracker.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
