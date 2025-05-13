
# DateTimeHelper

This is a utility class for DateTime operations.

## Local Date Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromSimpleDate(String date)` | Parse a simple date string to a LocalDate object. | `LocalDate` |
| `toSimpleDate(LocalDate value)` | Convert a LocalDate object to a string. | `String` |
| `toSimpleDate(List<LocalDate> values)` | Convert a List of LocalDate objects to strings. | `List<String>` |
| `toSimpleDate(Map<String, LocalDate> values)` | Convert a Map of LocalDate objects to strings. | `Map<String, String>` |
| `toArrayOfMapOfSimpleDate(List<Map<String, LocalDate>> values)` | Convert a List of Map of LocalDate objects to strings. | `List<Map<String, String>>` |

## Rfc1123 Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromRfc1123DateTime(String date)` | Parse a datetime string in Rfc1123 format to a DateTime object. | `LocalDateTime` |
| `toRfc1123DateTime(LocalDateTime value)` | Convert a DateTime object to a Rfc1123 formatted string. | `String` |
| `toRfc1123DateTime(List<LocalDateTime> values)` | Convert a List of DateTime objects to Rfc1123 formatted strings. | `List<String>` |
| `toRfc1123DateTime(Map<String, LocalDateTime> values)` | Convert a Map of DateTime objects to Rfc1123 formatted strings. | `Map<String, String>` |
| `toArrayOfMapOfRfc1123DateTime(List<Map<String, LocalDateTime> values)` | Convert a List of Map of DateTime objects to Rfc1123 formatted strings. | `List<Map<String, String>>` |

## Rfc8601(Rfc3339) Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromRfc8601DateTime(String date)` | Parse a datetime string in Rfc8601(Rfc3339) format to a DateTime object. | `LocalDateTime` |
| `toRfc8601DateTime(LocalDateTime value)` | Convert a DateTime object to a Rfc8601(Rfc3339) formatted string. | `String` |
| `toRfc8601DateTime(List<LocalDateTime> values)` | Convert a List of DateTime objects to Rfc8601(Rfc3339) formatted strings. | `List<String>` |
| `toRfc8601DateTime(Map<String, LocalDateTime> values)` | Convert a Map of DateTime objects to Rfc8601(Rfc3339) formatted strings. | `Map<String, String>` |
| `toArrayOfMapOfRfc8601DateTime(List<Map<String, LocalDateTime> values)` | Convert a List of Map of DateTime objects to Rfc8601(Rfc3339) formatted strings. | `List<Map<String, String>>` |

## Unix Timestamp Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromUnixTimestamp(String date)` | Parse a Unix Timestamp string to a DateTime object. | `LocalDateTime` |
| `toUnixTimestamp(LocalDateTime value)` | Convert a DateTime object to a Unix Timestamp string. | `String` |
| `toUnixTimestamp(List<LocalDateTime> values)` | Convert a List of DateTime objects to Unix Timestamp strings. | `List<String>` |
| `toUnixTimestamp(Map<String, LocalDateTime> values)` | Convert a Map of DateTime objects to Unix Timestamp strings. | `Map<String, String>` |

## Unix Timestamp(Long) Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromUnixTimestamp(Long date)` | Parse a Unix Timestamp to a DateTime object. | `LocalDateTime` |
| `toUnixTimestampLong(LocalDateTime value)` | Convert a DateTime object to a Unix Timestamp. | `Long` |
| `toUnixTimestampLong(List<LocalDateTime> values)` | Convert a List of DateTime objects to Unix Timestamp. | `List<Long>` |
| `toUnixTimestampLong(Map<String, LocalDateTime> values)` | Convert a Map of DateTime objects to Unix Timestamp. | `Map<String, Long>` |
| `toArrayOfMapOfUnixTimestampLong(List<Map<String, LocalDateTime> values)` | Convert a List of Map DateTime objects to Unix Timestamp. | `List<Map<String, Long>>` |

