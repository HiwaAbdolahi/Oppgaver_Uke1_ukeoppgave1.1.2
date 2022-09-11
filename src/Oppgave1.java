public class Oppgave1 {
    public static void main(String[] args) {

        int[] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};

        int min_index = min(a);

        System.out.println("Indeksen til minste tallet i rekken a er : "+min_index);
    }

    static int min(int[] a) {
            // Initsialiser med første element
        int min_value = a[0];
        int min_index = 0;

        // Loop over alle resterende elementer og sjekk om vi
        //finner et mindre tall

        for(int i = 1; i < 15; ++i){
            int value = a[i];
            int index = i;


            //Sjekk om verdiene er mindre enn det vi har sett tidligere
            if (value < min_value) {
                min_value = value;
                min_index = index;
            }
        }

        //Returner index til minste verdi.
        return min_index;

    }
}
