/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appcrud.p_uts_23090104_a_2025;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.model.Updates;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Fahri
 */
public class CRUD_23090104_A_2025 {
    public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017"; // koneksi ke MongoDB lokal

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {

            // Ambil database (kalau belum ada akan otomatis dibuat)
            MongoDatabase database = mongoClient.getDatabase("uts_23090104_A_2025");

            // Ambil collection
            MongoCollection<Document> collection = database.getCollection("coll_23090104_A_2025");

//            // Buat data baru
            Document doc1 = new Document("nama", "Ahmad Fahri")
                    .append("umur", 20)
                    .append("kota", "Tegal");
            Document doc2 = new Document("nama", "Putra Pratama")
                    .append("umur", 19)
                    .append("kota", "Semarang");
            Document doc3 = new Document("nama", "W.S. Rendra")
                    .append("umur", 21)
                    .append("kota", "Yogyakarta");

//          Masukkan ke dalam list
            List<Document> documents = Arrays.asList(doc1, doc2, doc3);
            
//            // Insert data ke collection
            collection.insertMany(documents);

            System.out.println("Data berhasil dimasukkan ke MongoDB!");

            // Read semua dokumen di collection
//            FindIterable<Document> result = collection.find();
//
//            System.out.println("Data yang ada di MongoDB:");
//            for (Document doc : result) {
//                System.out.println(doc.toJson());
//            }
//        } catch (Exception e) {
//            System.out.println("Terjadi kesalahan: " + e.getMessage());
//        }
//          update data
//            Bson filter = Filters.eq("nama","Putra Pratama");
//            Bson update = Updates.set("nama","Sapardi Djoko Damono");
//            
//            collection.updateOne(filter, update);
//          Delete Data
//            Bson del = Filters.eq("umur",21);
//            collection.deleteOne(del);

// Kata kunci pencarian (misalnya: "Ahmad")
//        String keyword = "Sapardi";

        // Query: cari nama yang mengandung kata "Ahmad" (menggunakan regex)
//        Bson filter = regex("nama", keyword, "i"); // "i" = case-insensitive

        // Jalankan pencarian
//        FindIterable<Document> hasil = collection.find(filter);

        // Tampilkan hasil
//        for (Document doc : hasil) {
//            System.out.println(doc.toJson());
//        }

        }
    }
}
