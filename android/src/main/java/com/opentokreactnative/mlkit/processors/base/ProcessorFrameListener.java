package com.opentokreactnative.mlkit.processors.base;

public interface ProcessorFrameListener {
    void onFrame(byte[] frame, int width, int height, int rotation);
}
