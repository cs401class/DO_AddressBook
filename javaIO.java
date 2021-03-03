public class javaIO {
    public int init(String filename) throws FileNotFoundException {

        int count = 0;
        Scanner scan = new Scanner(new File(filename));
        while(scan.hasNextLine()) {
            String[] tokens = scan.nextLine();
            if(tokens.length == 8) {

                int zip = 0;
                try {
                    zip = Integer.parseInt(tokens[5]);
                } catch(Exception e) {
                    continue;
                }
                count++;
                add(new AddressEntry(tokens[0], tokens[1], tokens[2],
                        tokens[3], tokens[4], zip, tokens[6], tokens[7]));

            }
        }
        scan.close();
        return count;

    }
}
