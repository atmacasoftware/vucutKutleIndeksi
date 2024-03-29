# Vücut Kitle İndeksi Hesaplama Programı

Vücut Kitle İndeksi Nedir?  VKİ, bireyin vücut ağırlığının (kg), boy uzunluğunun (m cinsinden) karesine (BKI=kg/m2) bölünmesiyle elde edilen bir değerdir. Bu değer Dünya Sağlık Örgütü’nün obezite sınıflandırması esas alınarak obeziteyi belirlemek için yaygın olarak kullanılmaktadır. VKİ boy uzunluğuna göre vücut ağırlığının tahmin edilmesinde kullanılmakta, vücutta yağ dağılımı hakkında bilgi vermemektedir. 

* Programda kullanıcıdan int türünde ve cm cinsinde boy bilgisi alınmaktadır.
* Double türünde kilo bilgisi alınmaktadır.
* `double vki = kilo / ((boy / 100.0) * (boy / 100.0))` formülü ile vücut kitle indeksi hesaplanmaktadır.

Vücut kitle indeksine göre aşağıdaki yorumlar yapılmaktadır:
* 18.5 ve altı: Zayıf
* 18.5 - 24.9: Normal kilolu
* 25.0 - 29.9: Fazla kilolu
* 30.0 - 34.9: Obez (1. derece obezite)
* 35.0 - 39.9: Aşırı obez (2. derece obezite)
* 40 ve üstü: Morbid obez (3. derece obezite)

