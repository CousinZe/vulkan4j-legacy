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
/// typedef struct VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 computeDerivativeGroupQuads;
///     VkBool32 computeDerivativeGroupLinear;
/// } VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.html">VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR</a>
public record VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR);
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

    public @unsigned int computeDerivativeGroupQuads() {
        return segment.get(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads);
    }

    public void computeDerivativeGroupQuads(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads, value);
    }

    public @unsigned int computeDerivativeGroupLinear() {
        return segment.get(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear);
    }

    public void computeDerivativeGroupLinear(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear, value);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$computeDerivativeGroupQuads = PathElement.groupElement("computeDerivativeGroupQuads");
    public static final PathElement PATH$computeDerivativeGroupLinear = PathElement.groupElement("computeDerivativeGroupLinear");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$computeDerivativeGroupQuads = (OfInt) LAYOUT.select(PATH$computeDerivativeGroupQuads);
    public static final OfInt LAYOUT$computeDerivativeGroupLinear = (OfInt) LAYOUT.select(PATH$computeDerivativeGroupLinear);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeDerivativeGroupQuads = LAYOUT.byteOffset(PATH$computeDerivativeGroupQuads);
    public static final long OFFSET$computeDerivativeGroupLinear = LAYOUT.byteOffset(PATH$computeDerivativeGroupLinear);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeDerivativeGroupQuads = LAYOUT$computeDerivativeGroupQuads.byteSize();
    public static final long SIZE$computeDerivativeGroupLinear = LAYOUT$computeDerivativeGroupLinear.byteSize();
}
