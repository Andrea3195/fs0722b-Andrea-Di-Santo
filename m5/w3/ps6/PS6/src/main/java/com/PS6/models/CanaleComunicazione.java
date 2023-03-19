package com.PS6.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CanaleComunicazione implements Comunicazione{

    @Override
    public void inviaMessaggio(String messaggio) {
        System.out.println("Messaggio: " + messaggio);
    }

}