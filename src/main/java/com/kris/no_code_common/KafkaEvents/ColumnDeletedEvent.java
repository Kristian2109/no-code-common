package com.kris.no_code_common.KafkaEvents;

public record ColumnDeletedEvent(
    String tableId,
    String columnId
) { }
