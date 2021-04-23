# SKOR

## Project setup

Proje bir gradle projesidir. ```gradle build ``` ile build edip hazır hale getirebilirsiniz.
Projede H2 InMemory Database Kullanılmıştır, herhangi bir database konfigürasyonuna gerek yoktur.
Java 8 gereksinimi vardır.

### Project Description
Projede Monolittir, ama paket tasarımına bakılırsa Microservis mimarisine rahatça geçecek 
şekilde tasarlanmıştır.Sadece bir endpoint için farklı projeler oluşturmak istemedim.

##### Project Missing Features
**Unit Test**,
implement edilmedi.Unit Test konusunda çok iyi değilim. Daha önce Unit Test önemseyen 
bir şirkette çalışmadım.
**Swager**, implement edilmedi, fazla vaktim olmadığı için implement etmedim.
Validasyonlar tam anlamıyla uygulanmadı, ama görülmesi için bir validasyon örneği uyguladım.Tc Kimlik numarası
`0` ile başlarsa şartı için görebilirsiniz. *score package* main package olarak düşünülmüştür. Yani Client projesinin 
end-pointidir.

##### Thanks
