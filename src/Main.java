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
        HashSet<String> duGaideliai = new HashSet<String>() {{
            add("Du");
            add("gaideliai");
            add("du");
            add("gaideliai");
            add("baltus");
            add("žirnius");
            add("kūlė");
        }};
        duGaideliai.add("Dar vienas"); //pabandymas
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
        trysViename.add(duGaideliai.iterator().next()); //kodel taip sudetingai?
        trysViename.add(saulesSistema.get(0));
        System.out.println(trysViename);
        System.out.println();


        /*Sukurkite mokinių sąrašą  (Mokinys turi vardąPavardę, tris pažymius ir pažymių vidurkį).*/
        Map<String, Pazymiai> mokiniuSarasas = new HashMap<>();
        mokiniuSarasas.put("Vardas Pavardenis", new Pazymiai(8, 5, 6, 6.33));
        System.out.println(mokiniuSarasas); // kaip reikia isvesti?
        System.out.println();


        /*Sukurkite mokinių vidurkių kolekciją ir apskaičiuokite skirtumą
        tarp aukščiausio ir žemiausio vidurkio*/
        TreeSet<Float> vidurkiai = new TreeSet<>();
        vidurkiai.add(7.5f);
        vidurkiai.add(8.3f);
        vidurkiai.add(6.9f);
        vidurkiai.add(9.0f);
        System.out.println(vidurkiai.higher(7.5f));
        System.out.println(vidurkiai.lower(8.3f));


        /*TreeSet<String, Float> vidurkiai = new TreeSet();
        vidurkiai.add("Pirmas", 7.5f);
        vidurkiai.add("Antras", 8.3f);
        vidurkiai.add("Trecias", 6.9f);
        vidurkiai.add("Ketvirtas", 9.0f);
        System.out.println(vidurkiai.higher());
        System.out.println(vidurkiai.lower());*/

    }
}
class Pazymiai {
    Integer i, j, k;
    Double vidurkis;

    Pazymiai (Integer i,Integer j, Integer k, Double vidurkis ) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.vidurkis = vidurkis;
    }
}