package tech.icey.vk4j.handle;

import tech.icey.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPass.html">VkRenderPass</a>
public record VkRenderPass(MemorySegment segment) implements IPointer {
    public record Buffer(MemorySegment segment) {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public VkRenderPass read() {
            return new VkRenderPass(readRaw());
        }

        public VkRenderPass read(long index) {
            return new VkRenderPass(readRaw(index));
        }

        public MemorySegment readRaw() {
            return readRaw(0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public VkRenderPass[] readAll() {
            VkRenderPass[] handles = new VkRenderPass[(int)size()];
            for (int i = 0; i < handles.length; i++) {
                handles[i] = read(i);
            }
            return handles;
        }

        public void write(VkRenderPass value) {
            writeRaw(value.segment());
        }

        public void write(long index, VkRenderPass value) {
            writeRaw(index, value.segment());
        }

        public void writeRaw(MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }

        public void writeRaw(long index, MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        public Buffer offset(long offset) {
            return new Buffer(segment.asSlice(
                offset * ValueLayout.ADDRESS.byteSize(),
                (size() - offset) * ValueLayout.ADDRESS.byteSize()
            ));
        }

        @unsafe
        public Buffer reinterpret(long newSize) {
            return new Buffer(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
        }

        public static Buffer allocate(Arena arena) {
            return new Buffer(arena.allocate(ValueLayout.ADDRESS));
        }

        public static Buffer allocate(Arena arena, long size) {
            return new Buffer(arena.allocate(ValueLayout.ADDRESS, size));
        }
    }
}
