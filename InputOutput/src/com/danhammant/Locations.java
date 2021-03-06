package com.danhammant;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException{

        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for(Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }

//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
//
//            for (Location location : locations.values()) {
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location: " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + " exits");
//                locFile.writeInt(location.getExits().size() - 1);
//
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }

//        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
//             BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q"))
//                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
//
//                }
//            }
//        }

    }

    //1. First four bytes will contain number of locations (0-3)
    //2. Next four bytes will contain start offset of the locations section (4-7)
    //3. Next will contain the index (index is 1692 bytes long.  It will start at byte 8 and end at 1699)
    //4. Final will contain the location records (the data).  It will start at 1700.

    static{
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean eof = false;
            while(!eof) {
                try{
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read location: " + location.getLocationID() + ": " + location.getDescription());
                    System.out.println("Found " + location.getExits().size() + " exits");

                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }

//            while(!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits");
//
//                    for(int i = 0; i < numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + ", " + destination);
//                    }
//                    locations.put(locID, new Location(locID, description, exits));
//
//                } catch (EOFException e) {
//                    eof = true;
//                }
//            }


//        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_big.txt"))){
//            String input;
//            while ((input = locFile.readLine()) != null) {
//
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String description = data[1];
//
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //Now read the exits
//        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))){
//            String input;
//            while ((input = dirFile.readLine()) != null) {
//
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
