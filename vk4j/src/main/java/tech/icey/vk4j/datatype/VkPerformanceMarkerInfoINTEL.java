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
/// typedef struct VkPerformanceMarkerInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t marker;
/// } VkPerformanceMarkerInfoINTEL;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPerformanceMarkerInfoINTEL.html">VkPerformanceMarkerInfoINTEL</a>
public record VkPerformanceMarkerInfoINTEL(MemorySegment segment) implements IPointer {
    public VkPerformanceMarkerInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL);
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

    public @unsigned long marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@unsigned long value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }

    public static VkPerformanceMarkerInfoINTEL allocate(Arena arena) {
        return new VkPerformanceMarkerInfoINTEL(arena.allocate(LAYOUT));
    }

    public static VkPerformanceMarkerInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceMarkerInfoINTEL[] ret = new VkPerformanceMarkerInfoINTEL[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPerformanceMarkerInfoINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceMarkerInfoINTEL clone(Arena arena, VkPerformanceMarkerInfoINTEL src) {
        VkPerformanceMarkerInfoINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceMarkerInfoINTEL[] clone(Arena arena, VkPerformanceMarkerInfoINTEL[] src) {
        VkPerformanceMarkerInfoINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("marker")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$marker = (OfLong) LAYOUT.select(PATH$marker);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$marker = LAYOUT$marker.byteSize();
}
