# org.example.Apteka

Konsolowa aplikacja apteki, która posiada:
- system logowania
- dwustopniowe menu dla 3 typow uzytkownikow pracownik apteki, administrator, klient
- magazyn leków
- wydawanie recept na podstawie generatora recept
- wyszukiwarke leków

Cele do zrealizowania:
- pracownik apteki: 
  1. Przegląd dostępnych leków. 
  2. Dodanie nowych leków. 
  3. Edycja dostępnych leków.
  4. Usunięcie dostepnego leku.
  5. Złożenie zamówienia na nowe leki.

- klient:
  1. Odbierz receptę.
  2. Sprawdz lek (wyszukaj po nazwie lek i wyświel jego opis).
  3. Historia zakupów.
  4. Zwrot leku.
  5. Najbliższa apteka.

- admin:
  1. Przegląd wszystkich aptek +
  2. Edycja danych apteki (np zmiana adresu)
  3. Usunięcie apteki
  4. Przegląd pracowników/klient
  5. Dodanie pracowników/klient
  6. Edycja danych pracownika/klient
  6. Usunięcie pracownika/klient

- zabezpieczenia:
  1. Logowanie do systemu +
     1. md5 +
     2. zabezpieczenie captcha przed botami
     2. sol i pieprz
     3. 10 próby logowania do serwiu (10 bledy timeout na 5 min progrsywny)
     4. 2 etapowe logowanie
  2. Sesja po zalogowaniu (czas bycia zalogowanym np 5 min później przedłużenie lub wylogowanie)
  
- generatory(dostęp ma admin):
  1. klientów ma tworzyc obiekty klientów i dopisywać je do pliku tekstowego
  2. leków ma tworzyć obiekty leków i dopisywać je do pliku tekstowego
  3. recept ma tworzyć recepte i przypisywać ja do każdego klienta
  4. 
Stan na 15.05.2024:
do poprawy sytem logowania - na sztywno podane wartości 
