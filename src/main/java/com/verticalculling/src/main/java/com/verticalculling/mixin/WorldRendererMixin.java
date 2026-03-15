package com.verticalculling.mixin;

import net.minecraft.client.MinecraftClient;

public class WorldRendererMixin {

    public static boolean shouldRenderChunk(int chunkY) {

        MinecraftClient client = MinecraftClient.getInstance();

        if (client.player == null) return true;

        int playerY = client.player.getBlockY();

        return chunkY >= playerY - 16;
    }
}
