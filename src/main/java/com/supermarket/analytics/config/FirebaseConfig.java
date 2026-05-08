package com.supermarket.analytics.config; // Ensure this package matches

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource; // This is important

import java.io.FileInputStream;
import java.io.IOException;

@Configuration // THIS ANNOTATION IS CRUCIAL
public class FirebaseConfig {

    @Bean // THIS ANNOTATION IS CRUCIAL
    public Firestore firestore() throws IOException {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream(new ClassPathResource("productdashboard-92064-firebase-adminsdk-fbsvc-e0c4116970.json").getFile());

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
                System.out.println("Firebase Admin SDK initialized successfully.");
            } else {
                System.out.println("Firebase Admin SDK already initialized.");
            }

            return FirestoreClient.getFirestore();
        } catch (IOException e) {
            System.err.println("Error initializing Firebase Admin SDK: " + e.getMessage());
            throw new RuntimeException("Failed to initialize Firebase Admin SDK", e);
        }
    }
}