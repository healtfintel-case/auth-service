# Auth Service - Konfigürasyon Açıklamaları

Bu projede kullanılan `application.yml` dosyasındaki ayarların ne işe yaradığını aşağıda basit bir şekilde bulabilirsin:

---

## spring.application.name
- Uygulamanın adını belirler. Servisler arası iletişimde bu isim kullanılır.

## spring.datasource
- Veritabanı bağlantı ayarlarıdır.
  - `url`: Veritabanının adresi (örnekte PostgreSQL kullanılıyor).
  - `username` ve `password`: Veritabanına bağlanmak için kullanıcı adı ve şifre.
  - `driver-class-name`: Hangi veritabanı sürücüsünün kullanılacağını belirtir.

## spring.jpa
- JPA (Java Persistence API) ve Hibernate ile ilgili ayarlar.
  - `ddl-auto: create-drop`: Uygulama her başlatıldığında veritabanı tablolarını oluşturur ve kapatırken siler (geliştirme için uygundur).
  - `show-sql: true`: Konsolda SQL sorgularını gösterir.
  - `format_sql: true`: SQL sorgularını daha okunabilir şekilde gösterir.
  - `dialect`: Hangi veritabanı dilinin kullanılacağını belirtir (PostgreSQL).

## server.port
- Uygulamanın çalışacağı port numarası (varsayılan: 8081).

## eureka.client.serviceUrl.defaultZone
- Eureka servis keşfi için kullanılan adres. Mikroservisler birbirini bu adresten bulur.

## eureka.instance.hostName
- Servisin Eureka'ya hangi isimle kaydolacağını belirtir.

---

Bu ayarlar sayesinde uygulaman hem veritabanına bağlanır, hem diğer servislerle haberleşir.
