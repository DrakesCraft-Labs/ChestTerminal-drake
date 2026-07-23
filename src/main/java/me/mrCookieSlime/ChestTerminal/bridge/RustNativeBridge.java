package me.mrCookieSlime.ChestTerminal.bridge;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.file.Path;
import java.util.logging.Logger;

public final class RustNativeBridge {
    private static final Logger LOGGER = Logger.getLogger("ChestTerminal-RustBridge");
    private static boolean isNativeLoaded = false;

    public static void initialize(Path nativeLibPath) {
        try {
            System.load(nativeLibPath.toAbsolutePath().toString());
            isNativeLoaded = true;
            LOGGER.info("⚡ [ChestTerminal] Bound to Slimefun-Rust FFM Engine!");
        } catch (Throwable t) {
            LOGGER.warning("⚠️ [ChestTerminal] Rust native library not loaded: " + t.getMessage());
        }
    }

    public static boolean isNativeLoaded() { return isNativeLoaded; }
}
