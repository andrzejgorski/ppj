I. [1 pkt.] Zdefiniuj klasę Cukierek z polami:

    • String smak,
    • double waga.

Utwórz konstruktor inicjujący te pola i metodę show() wyświetlającą stan wszystkich
pól cukierka.

II. [1 pkt.] Zdefiniuj klasę Fabryka implementującą statyczną metodę make. Metoda ta
będzie przyjmować jako parametr wartość typu int określającą jaki rodzaj cukierków
należy produkować, a zwracać obiekt reprezentujący ten cukierek. Jeżeli cukierek
określonego typu był już produkowany w tej fabryce, należy zwrócić jego obiekt. W
przeciwnym przypadku metoda make poprzedzi zwrócenie obiektu jego fabrykacją.

III. [1 pkt.] Utwórz klasę Kontener zawierającą:

    • pole Cukierek ladunek,
    • pole double masaLadunku,
    • pole int dniPrzydatnosci,
    • konstruktor – inicjujący pole dopuszczalną masą ładunku,
    • metodę – załaduj przyjmującą argumenty:
        – Cukierek wyprodukowany przez fabrykę z poprzednich zadań,
        – dniPrzydatności - przypisującą ile dni cukierki mogą być przechowywane;
    • metodę sprawdzPrzydatnosc – zwracającą wartość logiczną czy produkt nadaje się jeszcze do spożycia.
    
IV. [1 pkt.] Utwórz klasę Magazyn przechowującą Kontenery na pięcioelementowym stosie,
implementującą metody przyjmijKontener i wydajKontener.
Przedstaw przykład pokazujący poprawne działanie magazynu.
Zadbaj aby kontenery przechowywane w magazynie zawsze poukładane były w kolejności
ilości dni przydatności produktu. Zwracam uwagę na fakt, że na stosie nie
można wykonywać innych operacji niż pobranie lub ładowanie kontenera.