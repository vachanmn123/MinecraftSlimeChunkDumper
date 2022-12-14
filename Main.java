import java.util.Random;
import java.io.*;

class MinecraftSlimeChunkDumper {
  public static void main(String args[]) {
    long seed = 832231523205073210L;
    for (int x = 0; x <= 1000; x++) {
      for (int z = 0; z <= 1000; z++) {
        if (checkChunk(x, z, seed)) {
          System.out.println("Slime Chunk found at: " + x + ", " + z);
          logChunk(x, z);
        }
      }
    }
  }

  public static boolean checkChunk(int x, int z, long seed) {
    Random rnd = new Random(
        seed +
            (int) (x * x * 0x4c1906) +
            (int) (x * 0x5ac0db) +
            (int) (z * z) * 0x4307a7L +
            (int) (z * 0x5f24f) ^ 0x3ad8025fL);
    return rnd.nextInt(10) == 0;
  }

  public static void logChunk(int x, int z) {
    File file = new File("out.txt");
    if (!file.exists()) {
      System.out.println("Create an empty file called out.txt before running...")
      return;
    }
    trexists()exists()exists()exists()y (FileWriter fr = new FileWriter(file, true)) {
      fr.write("\n" + x + ", " + z);
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}