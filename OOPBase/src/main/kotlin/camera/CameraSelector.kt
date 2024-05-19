package camera

import java.awt.Point

class CameraSelector(facing: Int, type: String, resolution: Point) {

    companion object{
        const val LENS_FACING_BACK = 0
        const val LENS_FACING_FRONT = 1
    }

    private var cameraFacing: Int = facing
    private var cameraType: String = type
    private var cameraResolution: Point = resolution

    fun selectCamera(){

    }

    class Builder() {
        private var cameraFacing: Int = 0
        private var cameraType: String = "Nokia"
        private var cameraResolution: Point = Point(360, 640)

        fun setCameraFacing(facing: Int): CameraSelector.Builder {
            cameraFacing = facing
            return this
        }
        fun setCameraType(type: String): CameraSelector.Builder {
            cameraType = type
            return this
        }
        fun setCameraResolution(resolution: Point): CameraSelector.Builder {
            cameraResolution = resolution
            return this
        }
        fun build(): CameraSelector{
            return CameraSelector(cameraFacing, cameraType, cameraResolution)
        }
    }

}