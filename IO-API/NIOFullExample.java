// ✅ ONE FULL JAVA NIO FILES EXAMPLE
// (Create → Analyze → Write → Copy → ZIP → Delete)

// 🎯 What this single program demonstrates
// This one program shows:

// 1️⃣ Create directories & files
// 2️⃣ Write & read file content
// 3️⃣ Analyze path properties
// 4️⃣ Copy & move files
// 5️⃣ Create a ZIP file
// 6️⃣ Delete files

// (All topics combined ✔)

// 💻 FULL WORKING JAVA PROGRAM
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class NIOFullExample {

    public static void main(String[] args) throws IOException {

        // 1️⃣ CREATE DIRECTORIES
        Path baseDir = Path.of("docs/backup");
        Files.createDirectories(baseDir);
        System.out.println("Directories created");

        // 2️⃣ CREATE FILE
        Path file = Path.of("docs/sample.txt");
        Files.createFile(file);
        System.out.println("File created");

        // 3️⃣ WRITE DATA INTO FILE
        Files.writeString(file, "Hello Java NIO\nWelcome to Files API");
        System.out.println("Data written");

        // 4️⃣ READ DATA FROM FILE
        String content = Files.readString(file);
        System.out.println("\nFile Content:\n" + content);

        // 5️⃣ ANALYZE PATH PROPERTIES
        System.out.println("\n--- File Properties ---");
        System.out.println("Exists: " + Files.exists(file));
        System.out.println("Readable: " + Files.isReadable(file));
        System.out.println("Writable: " + Files.isWritable(file));
        System.out.println("Is Regular File: " + Files.isRegularFile(file));

        BasicFileAttributes attr =
                Files.readAttributes(file, BasicFileAttributes.class);

        System.out.println("Size: " + attr.size());
        System.out.println("Created: " + attr.creationTime());

        // 6️⃣ COPY FILE
        Path copyPath = Path.of("docs/backup/sample_copy.txt");
        Files.copy(file, copyPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("\nFile copied");

        // 7️⃣ MOVE FILE
        Path movedPath = Path.of("docs/backup/sample_moved.txt");
        Files.move(copyPath, movedPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved");

        // 8️⃣ CREATE ZIP FILE
        Path zip = Path.of("backup.zip");
        try (FileSystem zipFs =
                     FileSystems.newFileSystem(
                             zip, Map.of("create", "true"))) {

            Path zipTarget = zipFs.getPath("sample.txt");
            Files.copy(file, zipTarget, StandardCopyOption.REPLACE_EXISTING);
        }
        System.out.println("ZIP file created");

        // 9️⃣ DELETE ORIGINAL FILE
        Files.deleteIfExists(file);
        System.out.println("Original file deleted");
    }
}
// ▶️ OUTPUT (Example)
// Directories created
// File created
// Data written

// File Content:
// Hello Java NIO
// Welcome to Files API

// --- File Properties ---
// Exists: true
// Readable: true
// Writable: true
// Is Regular File: true
// Size: 36
// Created: 2026-02-06T04:40:10Z

// File copied
// File moved
// ZIP file created
// Original file deleted
// 🧠 HOW THIS MAPS TO YOUR SLIDES
// Slide Topic	Covered In Program
// Analyze Path Properties	Files.exists, readAttributes
// Set / Read metadata	BasicFileAttributes
// Create Paths	createFile, createDirectories
// Temp / Backup folders	backup directory
// Copy / Move	Files.copy, Files.move
// Delete	deleteIfExists
// ZIP as FileSystem	FileSystems.newFileSystem
// ✍️ 5‑MARK EXAM ANSWER (WRITE THIS)
// Java NIO provides the Path and Files classes to perform advanced file operations. Using these APIs, we can create files and directories, read and write file content, analyze file attributes, copy, move and delete files, and even handle ZIP archives by treating them as a virtual file system.

// 🟢 ONE‑LINE MEMORY
// 👉 Path = where
// 👉 Files = what
// 👉 ZIP = virtual folder