package com.joojeongyong.auth.core.util

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.Date

class DateTimeUtil {
    fun toEpochMilli(dateTime: LocalDateTime): Long {
        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
    }

    fun toLocalDateTime(date: Date): LocalDateTime {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
    }


}