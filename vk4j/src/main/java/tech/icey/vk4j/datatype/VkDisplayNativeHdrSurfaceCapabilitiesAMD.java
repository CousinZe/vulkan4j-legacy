package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDisplayNativeHdrSurfaceCapabilitiesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 localDimmingSupport;
/// } VkDisplayNativeHdrSurfaceCapabilitiesAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayNativeHdrSurfaceCapabilitiesAMD.html">VkDisplayNativeHdrSurfaceCapabilitiesAMD</a>
public record VkDisplayNativeHdrSurfaceCapabilitiesAMD(MemorySegment segment) implements IPointer {
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int localDimmingSupport() {
        return segment.get(LAYOUT$localDimmingSupport, OFFSET$localDimmingSupport);
    }

    public void localDimmingSupport(@unsigned int value) {
        segment.set(LAYOUT$localDimmingSupport, OFFSET$localDimmingSupport, value);
    }

    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD allocate(Arena arena) {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(arena.allocate(LAYOUT));
    }

    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayNativeHdrSurfaceCapabilitiesAMD[] ret = new VkDisplayNativeHdrSurfaceCapabilitiesAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD clone(Arena arena, VkDisplayNativeHdrSurfaceCapabilitiesAMD src) {
        VkDisplayNativeHdrSurfaceCapabilitiesAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD[] clone(Arena arena, VkDisplayNativeHdrSurfaceCapabilitiesAMD[] src) {
        VkDisplayNativeHdrSurfaceCapabilitiesAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("localDimmingSupport")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$localDimmingSupport = PathElement.groupElement("localDimmingSupport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$localDimmingSupport = (OfInt) LAYOUT.select(PATH$localDimmingSupport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$localDimmingSupport = LAYOUT.byteOffset(PATH$localDimmingSupport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$localDimmingSupport = LAYOUT$localDimmingSupport.byteSize();
}
