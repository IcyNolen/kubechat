package com.kubechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubeChatApplication {
    public static void main(String[] args) {
        SpringApplication.run(KubeChatApplication.class, args);
        System.out.println("🚀 KubeChat WebSocket server started...");
    }
}

