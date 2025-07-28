package com.kris.no_code_common.KafkaEvents;

public record ColumnDeletedEvent(
    String databaseId,
    String tableId,
    String columnId
) { }
