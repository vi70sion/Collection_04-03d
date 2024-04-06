import java.util.*;
public class Main {
    public static void main(String[] args) {


        /*Sukurkite masyvą iš 8 atsitiktinių sveikų skaitmenų. Sukurkite
        antrą masyvą, kuriame saugome boolean reikšmes, kurios
        atspindi visų pirmojo masyvo porų palyginimo rezultatą.
        (Lyginame (0 ir 1) (2 ir 3) (4 ir 5) bei (6 ir 7) elementus, jei jie
        yra lygūs, tuomet antrame masyve išsaugome reikšmę true, jei
        nelygūs tuomet false).
        */
        int[] skaiciai = new int[] {8, 7, 2, 2, 15, 2, 3, 10};
        boolean[] lygus = new boolean[4];
        int j = 0;
        for(int i = 0; i < skaiciai.length; i += 2) {
            System.out.println(skaiciai[i] + " " + skaiciai[i + 1]);
            lygus[j] = skaiciai[i] == skaiciai[i + 1];
            System.out.println(lygus[j]);
            j++;
        }
        System.out.println();


        /*Užduotis: sukurkite kolekciją su mūsų kurso mokinių vardais;
        Surūšiuokite abėcėlės tvarka ir atspausdinkite ekrane.
         */
        List<String> myList = new ArrayList<>();
        myList.add("Darius");
        myList.add("Deividas");
        myList.add("Zilvinas");
        myList.add("Sergejus");
        myList.add("Evaldas");
        myList.add("Ginte");
        myList.add("Skirmantas");
        myList.add("Agne");
        myList.add("Tadas");
        System.out.println("Pries rusiavima: " + myList);
        //System.out.println("Pries rusiavima: " + myList.toString());
        //sort(myList);
        Collections.sort(myList);
        System.out.println("Po rusiavimo: " + myList);
        System.out.println();


        /*Užduotis: sukurkite kolekciją, kurioje elementai negali kartotis;
        Sudėkite į ją tokius Stringus “Du”, “gaideliai”, “du”, “gaideliai”, “baltus”,
        “žirnius”, “ kūlė”; Atspausdinkite rezultatą ekrane.
        */
        HashSet<String> duGaideliai = new HashSet<>() {{
            add("Du");
            add("gaideliai");
            add("du");
            add("gaideliai");
            add("baltus");
            add("žirnius");
            add("kūlė");
        }};
        duGaideliai.add("Dar vienas"); //kitoks add pabandymas
        System.out.println(duGaideliai);
        System.out.println();


        /*Užduotis: Sukurkite kolekciją, kurioje surašytos  mūsų sistemos planetos
        ir jas galima būtų rasti pagal skaičius, kuris žymi atstumą nuo saulės
        (arčiausią nuo Saulės planetą saugokite kaip 1); Plutoną, išsaugokite su null raktu.
        Patikrinkite ar kolekcijoje yra 6 nuo Saulės planeta. Jeigu taip, pašalinkite ją iš kolekcijos.
         */
        Map<Integer, String> saulesSistema = new HashMap<>();
        saulesSistema.put(1, "Merkurijus");
        saulesSistema.put(2, "Venera");
        saulesSistema.put(3, "Zeme");
        saulesSistema.put(4, "Marsas");
        saulesSistema.put(null, "Plutonas");
        saulesSistema.put(5, "Jupiteris");
        saulesSistema.put(6, "Saturnas");
        if(saulesSistema.containsKey(6)){
            saulesSistema.remove(6);
        }
        System.out.println(saulesSistema);
        //System.out.println(saulesSistema.toString());
        System.out.println();


        /*Sukurkite kolekciją, kurios elementai būtų visi pirmieji (pagal saugojimo tvarką)
        elementai iš ką tik sukurtų trijų kolekcijų;*/
        List<Object> trysViename = new ArrayList<>();
        trysViename.add(myList.getFirst());
        trysViename.add(duGaideliai.iterator().next()); //HashSet class does not provide a direct method to retrieve the first element
        trysViename.add(saulesSistema.get(0));
        System.out.println(trysViename);
        System.out.println();


        /* Sukurkite mokinių sąrašą  (Mokinys turi vardąPavardę, tris pažymius ir pažymių vidurkį).
         * Sukurkite “žurnalą”, kuriame surašyti visi mokinių vardaiPavardės
         ir jų vidurkiai:*/

        Mokinys mokinys1 = new Mokinys("Vardas1 Pavarde1", new int[] {8, 7, 9});
        Mokinys mokinys2 = new Mokinys("Vardas2 Pavarde2", new int[] {10, 7, 8});
        Mokinys mokinys3 = new Mokinys("Vardas3 Pavarde3", new int[] {5, 7, 4});

        Map<Mokinys, Float> mokiniuSarasas = new HashMap<>();   //mokiniu sarasas
        mokiniuSarasas.put(mokinys1, mokinys1.vidurkioSkaiciavimas());
        mokiniuSarasas.put(mokinys2, mokinys1.vidurkioSkaiciavimas());
        mokiniuSarasas.put(mokinys3, mokinys1.vidurkioSkaiciavimas());

        Map<String, Float> zurnalas = new HashMap<>();          //zurnalas
        zurnalas.put(mokinys1.vardasPavarde, mokinys1.vidurkioSkaiciavimas());
        zurnalas.put(mokinys2.vardasPavarde, mokinys2.vidurkioSkaiciavimas());
        zurnalas.put(mokinys3.vardasPavarde, mokinys3.vidurkioSkaiciavimas());

        System.out.println("Mokiniu zurnalas: (vardas pavarde, vidurkis):");
        for(Map.Entry<String, Float> entry : zurnalas.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        /*Sukurkite mokinių vidurkių kolekciją ir apskaičiuokite skirtumą
        tarp aukščiausio ir žemiausio vidurkio*/

        TreeSet<Float> vidurkiuKolekcija = new TreeSet<>();
        for(Map.Entry<String, Float> entry : zurnalas.entrySet()){
            vidurkiuKolekcija.add(entry.getValue());
        }
        float maxVidurkis = vidurkiuKolekcija.getFirst();
        float minVidurkis = vidurkiuKolekcija.getFirst();
        for(Float element : vidurkiuKolekcija){
            if(maxVidurkis < element) maxVidurkis = element;
            if(minVidurkis > element) minVidurkis = element;
        }
        System.out.printf("Skirtumas tarp auksciausio ir zemiausiu vidurkiu: ");
        System.out.println(maxVidurkis - minVidurkis);


    }
}
class Mokinys {
    String vardasPavarde;
    int[] pazymiai;
    float vidurkis;
    public Mokinys (String vardasPavarde, int[] pazymiai) {
        this.vardasPavarde = vardasPavarde;
        this.pazymiai = pazymiai;
    }
    public float vidurkioSkaiciavimas(){
        int suma = 0;
        float vidurkis;
        for(int i = 0; i < pazymiai.length; i++) {
            suma += pazymiai[i];
        }
        vidurkis = (float) suma/ pazymiai.length;
        return vidurkis;
    }
}