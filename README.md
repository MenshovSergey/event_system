# event_system
Реализовать объект для учета однотипных событий в системе. Например, отправка фото в сервисе фотографий. События поступают в произвольный момент времени. Возможно как 10К событий в секунду так и 2 в час.
Интерфейс.

1 Учесть событие.

2 Выдать число событий за последнюю минуту (60 секунд).

3 Выдать число событий за последний час (60 минут).

4 Выдать число событий за последние сутки (24 часа).