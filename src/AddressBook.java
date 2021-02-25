import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * It includes a list of
 * address entries.
 *
 * @version 2.0
 *
 */
public class AddressBook {

    // Attributes..
    private List<AddressEntry> addressEntryList;

    /**
     * Constructor to create the
     * list of the address entries.
     */
    public AddressBook() {

        this.addressEntryList = new ArrayList<>();

    }

    /**
     * @return the list of address entries.
     */
    public List<AddressEntry> list() {

        return this.addressEntryList;

    }

    /**
     * It will add a new entry into the list.
     *
     * @param entry to add in list
     */
    public void add(AddressEntry entry) {

        this.addressEntryList.add(entry);

    }

    /**
     * It will remove entry from the list.
     *
     * @param entry to remove from list
     */
    public void remove(AddressEntry entry) {

        this.addressEntryList.remove(entry);

    }

    /**
     * It will search for the entries with the
     * last name given and find the Match.
     *
     * @param lastName the last name to find
     * @return the list of address entry/entries match.
     */
    public List<AddressEntry> find(String lastName) {

        List<AddressEntry> find = new ArrayList<>();
        for(AddressEntry entry: this.addressEntryList) {
            if(entry.getLastName().toLowerCase().contains(lastName.toLowerCase())) {
                find.add(entry);
            }
        }
        return find;

    }

    /**
     * It will read all of the data from the
     * file and put it into the address entries.
     *
     * @param filename to read
     * @return number of elements read from file.
     * @throws FileNotFoundException if file not found.
     */
    public int readFromFile(String filename) throws FileNotFoundException {
        int entrycount = 0;

        try {

            Scanner input = new Scanner(new File(filename));

            ArrayList info = new ArrayList();
            int count = 0;
            while (input.hasNextLine()) {
                entrycount++;
                while (count < 8) {
                    info.add(input.nextLine());
                    count++;
                }
                count = 0;
                add(new AddressEntry(info.get(0).toString(), info.get(1).toString(),
                        info.get(2).toString(), info.get(3).toString(), info.get(4).toString(),
                        Integer.parseInt(info.get(5).toString()), info.get(6).toString(), info.get(7).toString()));
                info = new ArrayList();
            }
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return entrycount;
    }


    /**
     * It will save all of the data into the file.
     * @throws IOException exception while writing data.
     */
    public void save() throws IOException {

        // Deleting the file if exists.
        File file = new File("Addresses.txt");
        if(file.exists()) {
            file.delete();
        }
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        for(AddressEntry entry: this.addressEntryList) {

            writer.println(entry.getFirstName()+","+entry.getLastName()
                    +","+entry.getStreet()+","+entry.getCity()+","+entry.getState()
                    +","+entry.getZip()+","+entry.getPhone()+","+entry.getEmail());

        }
        writer.close();

    }

}
