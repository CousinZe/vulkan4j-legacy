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
/// typedef struct VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxVertexAttribDivisor;
///     VkBool32 supportsNonZeroFirstInstance;
/// } VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.html">VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR</a>
public record VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR);
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

    public @unsigned int maxVertexAttribDivisor() {
        return segment.get(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor);
    }

    public void maxVertexAttribDivisor(@unsigned int value) {
        segment.set(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor, value);
    }

    public @unsigned int supportsNonZeroFirstInstance() {
        return segment.get(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance);
    }

    public void supportsNonZeroFirstInstance(@unsigned int value) {
        segment.set(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance, value);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[] ret = new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR src) {
        VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[] clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[] src) {
        VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxVertexAttribDivisor = PathElement.groupElement("maxVertexAttribDivisor");
    public static final PathElement PATH$supportsNonZeroFirstInstance = PathElement.groupElement("supportsNonZeroFirstInstance");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxVertexAttribDivisor = (OfInt) LAYOUT.select(PATH$maxVertexAttribDivisor);
    public static final OfInt LAYOUT$supportsNonZeroFirstInstance = (OfInt) LAYOUT.select(PATH$supportsNonZeroFirstInstance);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxVertexAttribDivisor = LAYOUT.byteOffset(PATH$maxVertexAttribDivisor);
    public static final long OFFSET$supportsNonZeroFirstInstance = LAYOUT.byteOffset(PATH$supportsNonZeroFirstInstance);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxVertexAttribDivisor = LAYOUT$maxVertexAttribDivisor.byteSize();
    public static final long SIZE$supportsNonZeroFirstInstance = LAYOUT$supportsNonZeroFirstInstance.byteSize();
}
