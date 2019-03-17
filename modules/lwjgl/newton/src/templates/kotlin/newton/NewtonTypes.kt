/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package newton

import org.lwjgl.generator.*

val long_long = IntegerType("long long", PrimitiveMapping.LONG)

val NewtonBody = "NewtonBody".opaque
val NewtonCollision = "NewtonCollision".opaque
val NewtonDeformableMeshSegment = "NewtonDeformableMeshSegment".opaque
val NewtonFracturedCompoundMeshPart = "NewtonFracturedCompoundMeshPart".opaque
val NewtonInverseDynamics = "NewtonInverseDynamics".opaque
val NewtonInverseDynamicsEffector = "NewtonInverseDynamicsEffector".opaque
val NewtonJoint = "NewtonJoint".opaque
val NewtonMaterial = "NewtonMaterial".opaque
val NewtonMesh = "NewtonMesh".opaque
val NewtonWorld = "NewtonWorld".opaque

val NewtonCollisionMaterial = struct(Module.NEWTON, "NewtonCollisionMaterial") {
    documentation = ""

    void.p("m_userData", "")
    int("m_userId", "")
    int("m_userFlags", "")
    float("m_userParam", "")[4]
}

val NewtonBoxParam = struct(Module.NEWTON, "NewtonBoxParam") {
    documentation = ""

    float("m_x", "")
    float("m_y", "")
    float("m_z", "")
}

val NewtonSphereParam = struct(Module.NEWTON, "NewtonSphereParam") {
    documentation = ""

    float("m_radio", "")
}

val NewtonCapsuleParam = struct(Module.NEWTON, "NewtonCapsuleParam") {
    documentation = ""

    float("m_radio0", "")
    float("m_radio1", "")
    float("m_height", "")
}

val NewtonCylinderParam = struct(Module.NEWTON, "NewtonCylinderParam") {
    documentation = ""

    float("m_radio0", "")
    float("m_radio1", "")
    float("m_height", "")
}

val NewtonConeParam = struct(Module.NEWTON, "NewtonConeParam") {
    documentation = ""

    float("m_radio", "")
    float("m_height", "")
}

val NewtonChamferCylinderParam = struct(Module.NEWTON, "NewtonChamferCylinderParam") {
    documentation = ""

    float("m_radio", "")
    float("m_height", "")
}

val NewtonConvexHullParam = struct(Module.NEWTON, "NewtonConvexHullParam") {
    documentation = ""

    int("m_vertexCount", "")
    int("m_vertexStrideInBytes", "")
    int("m_faceCount", "")
    float.p("m_vertex", "")
}

val NewtonCompoundCollisionParam = struct(Module.NEWTON, "NewtonCompoundCollisionParam") {
    documentation = ""

    int("m_chidrenCount", "")
}

val NewtonCollisionTreeParam = struct(Module.NEWTON, "NewtonCollisionTreeParam") {
    documentation = ""

    int("m_vertexCount", "")
    int("m_indexCount", "")
}

val NewtonDeformableMeshParam = struct(Module.NEWTON, "NewtonDeformableMeshParam") {
    documentation = ""

    int("m_vertexCount", "")
    int("m_triangleCount", "")
    int("m_vrtexStrideInBytes", "")
    unsigned_short.p("m_indexList", "")
    float.p("m_vertexList", "")
}

val NewtonHeightFieldCollisionParam = struct(Module.NEWTON, "NewtonHeightFieldCollisionParam") {
    documentation = ""

    int("m_width", "")
    int("m_height", "")
    int("m_gridsDiagonals", "")
    int("m_elevationDataType", "0 = 32 bit floats, 1 = unsigned 16 bit integers")
    float("m_verticalScale", "")
    float("m_horizonalScale_x", "")
    float("m_horizonalScale_z", "")
    float("m_horizonalDisplacementScale_x", "")
    float("m_horizonalDisplacementScale_z", "")
    void.p("m_vertialElevation", "")
    short.p("m_horizotalDisplacement", "")
    char.p("m_atributes", "")
}

val NewtonSceneCollisionParam = struct(Module.NEWTON, "NewtonSceneCollisionParam") {
    documentation = ""

    int("m_childrenProxyCount", "")
}

val NewtonCollisionInfoRecord = struct(Module.NEWTON, "NewtonCollisionInfoRecord") {
    documentation = ""

    float("m_offsetMatrix", "")[4][4]
    NewtonCollisionMaterial("m_collisionMaterial", "")
    int("m_collisionType", "tag id to identify the collision primitive")
    union {
        NewtonBoxParam("m_box", "")
        NewtonConeParam("m_cone", "")
        NewtonSphereParam("m_sphere", "")
        NewtonCapsuleParam("m_capsule", "")
        NewtonCylinderParam("m_cylinder", "")
        NewtonChamferCylinderParam("m_chamferCylinder", "")
        NewtonConvexHullParam("m_convexHull", "")
        NewtonDeformableMeshParam("m_deformableMesh", "")
        NewtonCompoundCollisionParam("m_compoundCollision", "")
        NewtonCollisionTreeParam("m_collisionTree", "")
        NewtonHeightFieldCollisionParam("m_heightField", "")
        NewtonSceneCollisionParam("m_sceneCollision", "")
        float("m_paramArray", "user define collision can use this to store information")[64]
    }
}

val NewtonJointRecord = struct(Module.NEWTON, "NewtonJointRecord") {
    documentation = ""

    float("m_attachmenMatrix_0", "")[4][4]
    float("m_attachmenMatrix_1", "")[4][4]
    float("m_minLinearDof", "")[3]
    float("m_maxLinearDof", "")[3]
    float("m_minAngularDof", "")[3]
    float("m_maxAngularDof", "")[3]
    NewtonBody.const.p("m_attachBody_0", "")
    NewtonBody.const.p("m_attachBody_1", "")
    float("m_extraParameters", "")[64]
    int("m_bodiesCollisionOn", "")
    char("m_descriptionType", "")[128]
}

val NewtonUserMeshCollisionCollideDesc = struct(Module.NEWTON, "NewtonUserMeshCollisionCollideDesc") {
    documentation = ""

    float("m_boxP0", "lower bounding box of intersection query in local space")[4]
    float("m_boxP1", "upper bounding box of intersection query in local space")[4]
    float("m_boxDistanceTravel", "max distance that box bpxP0 and boxP1 can travel on this timestep, used this for continue collision mode")[4]
    int("m_threadNumber", "current thread executing this query")
    int("m_faceCount", "the application should set here how many polygons intersect the query box")
    int("m_vertexStrideInBytes", "the application should set here the size of each vertex")
    float("m_skinThickness", "this is the minimum skin separation specified by the material between these two colliding shapes")
    void.p("m_userData", "user data passed to the collision geometry at creation time")
    NewtonBody.p("m_objBody", "pointer to the colliding body")
    NewtonBody.p("m_polySoupBody", "pointer to the rigid body owner of this collision tree")
    NewtonCollision.p("m_objCollision", "collision shape of the colliding body, (no necessarily the collision of m_objBody)")
    NewtonCollision.p("m_polySoupCollision", "collision shape of the collision tree, (no necessarily the collision of m_polySoupBody)")
    float.p("m_vertex", "the application should set here the pointer to the global vertex of the mesh")
    int.p("m_faceIndexCount", "the application should set here the pointer to the vertex count of each face")
    int.p("m_faceVertexIndex", "the application should set here the pointer index array for each vertex on a face")
}

val NewtonWorldConvexCastReturnInfo = struct(Module.NEWTON, "NewtonWorldConvexCastReturnInfo") {
    documentation = ""

    float("m_point", "collision point in global space")[4]
    float("m_normal", "surface normal at collision point in global space")[4]
    long_long("m_contactID", "collision ID at contact point")
    NewtonBody.const.p("m_hitBody", "body hit at contact point")
    float("m_penetration", "contact penetration at collision point")
}

val NewtonUserMeshCollisionRayHitDesc = struct(Module.NEWTON, "NewtonUserMeshCollisionRayHitDesc") {
    documentation = ""

    float("m_p0", "ray origin in collision local space")[4]
    float("m_p1", "ray destination in collision local space")[4]
    float("m_normalOut", "copy here the normal at the ray intersection")[4]
    long_long("m_userIdOut", "copy here a user defined id for further feedback")
    void.p("m_userData", "user data passed to the collision geometry at creation time")
}

val NewtonHingeSliderUpdateDesc = struct(Module.NEWTON, "NewtonHingeSliderUpdateDesc") {
    documentation = ""

    float("m_accel", "")
    float("m_minFriction", "")
    float("m_maxFriction", "")
    float("m_timestep", "")
}

val NewtonUserContactPoint = struct(Module.NEWTON, "NewtonUserContactPoint") {
    documentation = ""

    float("m_point", "")[4]
    float("m_normal", "")[4]
    long_long("m_shapeId0", "")
    long_long("m_shapeId1", "")
    float("m_penetration", "")
    int("m_unused", "")[3]
}

val NewtonConstraintDescriptor = struct(Module.NEWTON, "NewtonConstraintDescriptor") {
    documentation = ""

    float("m_jacobian01", "")[8][6]
    float("m_jacobian10", "")[8][6]
    float("m_minFriction", "")[8]
    float("m_maxFriction", "")[8]
    float("m_jointAccel", "")[8]
    float("m_jointStiffness", "")[8]
}

val NewtonMeshDoubleData = struct(Module.NEWTON, "NewtonMeshDoubleData") {
    documentation = "data structure for interfacing with NewtonMesh"

    double.p("m_data", "")
    int.p("m_indexList", "")
    int("m_strideInBytes", "")
}

val NewtonMeshFloatData = struct(Module.NEWTON, "NewtonMeshFloatData") {
    documentation = ""

    float.p("m_data", "")
    int.p("m_indexList", "")
    int("m_strideInBytes", "")
}

val dgWeights = struct(Module.NEWTON, "NewtonMeshVertexWeights") {
    documentation = ""

    float("m_weightBlends", "")[4]
    int("m_controlIndex", "")[4]
}

val NewtonMeshVertexWeightData = struct(Module.NEWTON, "NewtonMeshVertexWeightData") {
    documentation = ""

    dgWeights.p("m_data", "")
    int("m_strideInBytes", "")
}

val NewtonMeshVertexFormat = struct(Module.NEWTON, "NewtonMeshVertexFormat") {
    documentation = ""

    int("m_faceCount", "")
    int.p("m_faceIndexCount", "")
    int.p("m_faceMaterial", "")
    NewtonMeshDoubleData("m_vertex", "")
    NewtonMeshVertexWeightData("m_weight", "")
    NewtonMeshFloatData("m_normal", "")
    NewtonMeshFloatData("m_binormal", "")
    NewtonMeshFloatData("m_uv0", "")
    NewtonMeshFloatData("m_uv1", "")
    NewtonMeshFloatData("m_vertexColor", "")
}

val NewtonAllocMemory = Module.NEWTON.callback {
    void.p(
        "NewtonAllocMemory",
        "Newton callback functions",

        int("sizeInBytes", ""),

        nativeType = "NewtonAllocMemory"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonFreeMemory = Module.NEWTON.callback {
    void(
        "NewtonFreeMemory",
        "",

        void.p.const("ptr", ""),
        int("sizeInBytes", ""),

        nativeType = "NewtonFreeMemory"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldDestructorCallback = Module.NEWTON.callback {
    void(
        "NewtonWorldDestructorCallback",
        "",

        NewtonWorld.const.p.const("world", ""),

        nativeType = "NewtonWorldDestructorCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonPostUpdateCallback = Module.NEWTON.callback {
    void(
        "NewtonPostUpdateCallback",
        "",

        NewtonWorld.const.p.const("world", ""),
        float("timestep", ""),

        nativeType = "NewtonPostUpdateCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldListenerDebugCallback = Module.NEWTON.callback {
    void(
        "NewtonWorldListenerDebugCallback",
        "",

        NewtonWorld.const.p.const("world", ""),
        void.p.const("listener", ""),
        void.p.const("debugContext", ""),

        nativeType = "NewtonWorldListenerDebugCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldListenerBodyDestroyCallback = Module.NEWTON.callback {
    void(
        "NewtonWorldListenerBodyDestroyCallback",
        "",

        NewtonWorld.const.p.const("world", ""),
        void.p.const("listenerUserData", ""),
        NewtonBody.p.const("body", ""),

        nativeType = "NewtonWorldListenerBodyDestroyCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldUpdateListenerCallback = Module.NEWTON.callback {
    void(
        "NewtonWorldUpdateListenerCallback",
        "",

        NewtonWorld.const.p.const("world", ""),
        void.p.const("listenerUserData", ""),
        float("timestep", ""),

        nativeType = "NewtonWorldUpdateListenerCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldDestroyListenerCallback = Module.NEWTON.callback {
    void(
        "NewtonWorldDestroyListenerCallback",
        "",

        NewtonWorld.const.p.const("world", ""),
        void.p.const("listenerUserData", ""),

        nativeType = "NewtonWorldDestroyListenerCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonGetTimeInMicrosencondsCallback = Module.NEWTON.callback {
    long_long(
        "NewtonGetTimeInMicrosencondsCallback",
        "",

        void(),

        nativeType = "NewtonGetTimeInMicrosencondsCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonSerializeCallback = Module.NEWTON.callback {
    void(
        "NewtonSerializeCallback",
        "",

        void.p.const("serializeHandle", ""),
        void.const.p.const("buffer", ""),
        int("size", ""),

        nativeType = "NewtonSerializeCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonDeserializeCallback = Module.NEWTON.callback {
    void(
        "NewtonDeserializeCallback",
        "",

        void.p.const("serializeHandle", ""),
        void.p.const("buffer", ""),
        int("size", ""),

        nativeType = "NewtonDeserializeCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnBodySerializationCallback = Module.NEWTON.callback {
    void(
        "NewtonOnBodySerializationCallback",
        "",

        NewtonBody.p.const("body", ""),
        void.p.const("userData", ""),
        NewtonSerializeCallback("function", ""),
        void.p.const("serializeHandle", ""),

        nativeType = "NewtonOnBodySerializationCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnBodyDeserializationCallback = Module.NEWTON.callback {
    void(
        "NewtonOnBodyDeserializationCallback",
        "",

        NewtonBody.p.const("body", ""),
        void.p.const("userData", ""),
        NewtonDeserializeCallback("function", ""),
        void.p.const("serializeHandle", ""),

        nativeType = "NewtonOnBodyDeserializationCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnJointSerializationCallback = Module.NEWTON.callback {
    void(
        "NewtonOnJointSerializationCallback",
        "",

        NewtonJoint.const.p.const("joint", ""),
        NewtonSerializeCallback("function", ""),
        void.p.const("serializeHandle", ""),

        nativeType = "NewtonOnJointSerializationCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnJointDeserializationCallback = Module.NEWTON.callback {
    void(
        "NewtonOnJointDeserializationCallback",
        "",

        NewtonBody.p.const("body0", ""),
        NewtonBody.p.const("body1", ""),
        NewtonDeserializeCallback("function", ""),
        void.p.const("serializeHandle", ""),

        nativeType = "NewtonOnJointDeserializationCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnUserCollisionSerializationCallback = Module.NEWTON.callback {
    void(
        "NewtonOnUserCollisionSerializationCallback",
        "",

        void.p.const("userData", ""),
        NewtonSerializeCallback("function", ""),
        void.p.const("serializeHandle", ""),

        nativeType = "NewtonOnUserCollisionSerializationCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionDestroyCallback = Module.NEWTON.callback {
    void(
        "NewtonUserMeshCollisionDestroyCallback",
        "user collision callbacks",

        void.p.const("userData", ""),

        nativeType = "NewtonUserMeshCollisionDestroyCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionRayHitCallback = Module.NEWTON.callback {
    float(
        "NewtonUserMeshCollisionRayHitCallback",
        "",

        NewtonUserMeshCollisionRayHitDesc.p.const("lineDescData", ""),

        nativeType = "NewtonUserMeshCollisionRayHitCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionGetCollisionInfo = Module.NEWTON.callback {
    void(
        "NewtonUserMeshCollisionGetCollisionInfo",
        "",

        void.p.const("userData", ""),
        NewtonCollisionInfoRecord.p.const("infoRecord", ""),

        nativeType = "NewtonUserMeshCollisionGetCollisionInfo"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionAABBTest = Module.NEWTON.callback {
    int(
        "NewtonUserMeshCollisionAABBTest",
        "",

        void.p.const("userData", ""),
        float.const.p.const("boxP0", ""),
        float.const.p.const("boxP1", ""),

        nativeType = "NewtonUserMeshCollisionAABBTest"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionGetFacesInAABB = Module.NEWTON.callback {
    int(
        "NewtonUserMeshCollisionGetFacesInAABB",
        "",

        void.p.const("userData", ""),
        float.const.p.const("p0", ""),
        float.const.p.const("p1", ""),
        float.const.p.p.const("vertexArray", ""),
        int.p.const("vertexCount", ""),
        int.p.const("vertexStrideInBytes", ""),
        int.const.p.const("indexList", ""),
        int("maxIndexCount", ""),
        int.const.p.const("userDataList", ""),

        nativeType = "NewtonUserMeshCollisionGetFacesInAABB"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserMeshCollisionCollideCallback = Module.NEWTON.callback {
    void(
        "NewtonUserMeshCollisionCollideCallback",
        "",

        NewtonUserMeshCollisionCollideDesc.p.const("collideDescData", ""),
        void.const.p.const("continueCollisionHandle", ""),

        nativeType = "NewtonUserMeshCollisionCollideCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonTreeCollisionFaceCallback = Module.NEWTON.callback {
    int(
        "NewtonTreeCollisionFaceCallback",
        "",

        void.p.const("context", ""),
        float.const.p.const("polygon", ""),
        int("strideInBytes", ""),
        int.const.p.const("indexArray", ""),
        int("indexCount", ""),

        nativeType = "NewtonTreeCollisionFaceCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonCollisionTreeRayCastCallback = Module.NEWTON.callback {
    float(
        "NewtonCollisionTreeRayCastCallback",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonCollision.const.p.const("treeCollision", ""),
        float("intersection", ""),
        float.p.const("normal", ""),
        int("faceId", ""),
        void.p.const("usedData", ""),

        nativeType = "NewtonCollisionTreeRayCastCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonHeightFieldRayCastCallback = Module.NEWTON.callback {
    float(
        "NewtonHeightFieldRayCastCallback",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonCollision.const.p.const("heightFieldCollision", ""),
        float("intersection", ""),
        int("row", ""),
        int("col", ""),
        float.p.const("normal", ""),
        int("faceId", ""),
        void.p.const("usedData", ""),

        nativeType = "NewtonHeightFieldRayCastCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonCollisionCopyConstructionCallback = Module.NEWTON.callback {
    void(
        "NewtonCollisionCopyConstructionCallback",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonCollision.p.const("collision", ""),
        NewtonCollision.const.p.const("sourceCollision", ""),

        nativeType = "NewtonCollisionCopyConstructionCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonCollisionDestructorCallback = Module.NEWTON.callback {
    void(
        "NewtonCollisionDestructorCallback",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonCollision.const.p.const("collision", ""),

        nativeType = "NewtonCollisionDestructorCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonTreeCollisionCallback = Module.NEWTON.callback {
    void(
        "NewtonTreeCollisionCallback",
        "collision tree call back (obsoleted no recommended)",

        NewtonBody.const.p.const("bodyWithTreeCollision", ""),
        NewtonBody.const.p.const("body", ""),
        int("faceID", ""),
        int("vertexCount", ""),
        float.const.p.const("vertex", ""),
        int("vertexStrideInBytes", ""),

        nativeType = "NewtonTreeCollisionCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonBodyDestructor = Module.NEWTON.callback {
    void(
        "NewtonBodyDestructor",
        "",

        NewtonBody.const.p.const("body", ""),

        nativeType = "NewtonBodyDestructor"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonApplyForceAndTorque = Module.NEWTON.callback {
    void(
        "NewtonApplyForceAndTorque",
        "",

        NewtonBody.const.p.const("body", ""),
        float("timestep", ""),
        int("threadIndex", ""),

        nativeType = "NewtonApplyForceAndTorque"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonSetTransform = Module.NEWTON.callback {
    void(
        "NewtonSetTransform",
        "",

        NewtonBody.const.p.const("body", ""),
        float.const.p.const("matrix", ""),
        int("threadIndex", ""),

        nativeType = "NewtonSetTransform"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonIslandUpdate = Module.NEWTON.callback {
    int(
        "NewtonIslandUpdate",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        void.const.p("islandHandle", ""),
        int("bodyCount", ""),

        nativeType = "NewtonIslandUpdate"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonFractureCompoundCollisionOnEmitCompoundFractured = Module.NEWTON.callback {
    void(
        "NewtonFractureCompoundCollisionOnEmitCompoundFractured",
        "",

        NewtonBody.p.const("fracturedBody", ""),

        nativeType = "NewtonFractureCompoundCollisionOnEmitCompoundFractured"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonFractureCompoundCollisionOnEmitChunk = Module.NEWTON.callback {
    void(
        "NewtonFractureCompoundCollisionOnEmitChunk",
        "",

        NewtonBody.p.const("chunkBody", ""),
        NewtonFracturedCompoundMeshPart.p.const("fracturexChunkMesh", ""),
        NewtonCollision.const.p.const("fracturedCompountCollision", ""),

        nativeType = "NewtonFractureCompoundCollisionOnEmitChunk"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonFractureCompoundCollisionReconstructMainMeshCallBack = Module.NEWTON.callback {
    void(
        "NewtonFractureCompoundCollisionReconstructMainMeshCallBack",
        "",

        NewtonBody.p.const("body", ""),
        NewtonFracturedCompoundMeshPart.p.const("mainMesh", ""),
        NewtonCollision.const.p.const("fracturedCompountCollision", ""),

        nativeType = "NewtonFractureCompoundCollisionReconstructMainMeshCallBack"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldRayPrefilterCallback = Module.NEWTON.callback {
    unsigned_int(
        "NewtonWorldRayPrefilterCallback",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonCollision.const.p.const("collision", ""),
        void.p.const("userData", ""),

        nativeType = "NewtonWorldRayPrefilterCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonWorldRayFilterCallback = Module.NEWTON.callback {
    float(
        "NewtonWorldRayFilterCallback",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonCollision.const.p.const("shapeHit", ""),
        float.const.p.const("hitContact", ""),
        float.const.p.const("hitNormal", ""),
        long_long("collisionID", ""),
        void.p.const("userData", ""),
        float("intersectParam", ""),

        nativeType = "NewtonWorldRayFilterCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnAABBOverlap = Module.NEWTON.callback {
    int(
        "NewtonOnAABBOverlap",
        "",

        NewtonJoint.const.p.const("contact", ""),
        float("timestep", ""),
        int("threadIndex", ""),

        nativeType = "NewtonOnAABBOverlap"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonContactsProcess = Module.NEWTON.callback {
    void(
        "NewtonContactsProcess",
        "",

        NewtonJoint.const.p.const("contact", ""),
        float("timestep", ""),
        int("threadIndex", ""),

        nativeType = "NewtonContactsProcess"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnCompoundSubCollisionAABBOverlap = Module.NEWTON.callback {
    int(
        "NewtonOnCompoundSubCollisionAABBOverlap",
        """
        typedef int (*NewtonOnAABBOverlap) (const NewtonMaterial* const material, const NewtonBody* const body0, const NewtonBody* const body1, int
        threadIndex); typedef int (*NewtonOnCompoundSubCollisionAABBOverlap) (const NewtonMaterial* const material, const NewtonBody* const body0, const void*
        const collisionNode0, const NewtonBody* const body1, const void* const collisionNode1, int threadIndex);
        """,

        NewtonJoint.const.p.const("contact", ""),
        float("timestep", ""),
        NewtonBody.const.p.const("body0", ""),
        void.const.p.const("collisionNode0", ""),
        NewtonBody.const.p.const("body1", ""),
        void.const.p.const("collisionNode1", ""),
        int("threadIndex", ""),

        nativeType = "NewtonOnCompoundSubCollisionAABBOverlap"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonOnContactGeneration = Module.NEWTON.callback {
    int(
        "NewtonOnContactGeneration",
        "",

        NewtonMaterial.const.p.const("material", ""),
        NewtonBody.const.p.const("body0", ""),
        NewtonCollision.const.p.const("collision0", ""),
        NewtonBody.const.p.const("body1", ""),
        NewtonCollision.const.p.const("collision1", ""),
        NewtonUserContactPoint.p.const("contactBuffer", ""),
        int("maxCount", ""),
        int("threadIndex", ""),

        nativeType = "NewtonOnContactGeneration"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonBodyIterator = Module.NEWTON.callback {
    int(
        "NewtonBodyIterator",
        "",

        NewtonBody.const.p.const("body", ""),
        void.p.const("userData", ""),

        nativeType = "NewtonBodyIterator"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonJointIterator = Module.NEWTON.callback {
    void(
        "NewtonJointIterator",
        "",

        NewtonJoint.const.p.const("joint", ""),
        void.p.const("userData", ""),

        nativeType = "NewtonJointIterator"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonCollisionIterator = Module.NEWTON.callback {
    void(
        "NewtonCollisionIterator",
        "",

        void.p.const("userData", ""),
        int("vertexCount", ""),
        float.const.p.const("faceArray", ""),
        int("faceId", ""),

        nativeType = "NewtonCollisionIterator"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonBallCallback = Module.NEWTON.callback {
    void(
        "NewtonBallCallback",
        "",

        NewtonJoint.const.p.const("ball", ""),
        float("timestep", ""),

        nativeType = "NewtonBallCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonHingeCallback = Module.NEWTON.callback {
    unsigned_int(
        "NewtonHingeCallback",
        "",

        NewtonJoint.const.p.const("hinge", ""),
        NewtonHingeSliderUpdateDesc.p.const("desc", ""),

        nativeType = "NewtonHingeCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonSliderCallback = Module.NEWTON.callback {
    unsigned_int(
        "NewtonSliderCallback",
        "",

        NewtonJoint.const.p.const("slider", ""),
        NewtonHingeSliderUpdateDesc.p.const("desc", ""),

        nativeType = "NewtonSliderCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUniversalCallback = Module.NEWTON.callback {
    unsigned_int(
        "NewtonUniversalCallback",
        "",

        NewtonJoint.const.p.const("universal", ""),
        NewtonHingeSliderUpdateDesc.p.const("desc", ""),

        nativeType = "NewtonUniversalCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonCorkscrewCallback = Module.NEWTON.callback {
    unsigned_int(
        "NewtonCorkscrewCallback",
        "",

        NewtonJoint.const.p.const("corkscrew", ""),
        NewtonHingeSliderUpdateDesc.p.const("desc", ""),

        nativeType = "NewtonCorkscrewCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserBilateralCallback = Module.NEWTON.callback {
    void(
        "NewtonUserBilateralCallback",
        "",

        NewtonJoint.const.p.const("userJoint", ""),
        float("timestep", ""),
        int("threadIndex", ""),

        nativeType = "NewtonUserBilateralCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonUserBilateralGetInfoCallback = Module.NEWTON.callback {
    void(
        "NewtonUserBilateralGetInfoCallback",
        "",

        NewtonJoint.const.p.const("userJoint", ""),
        NewtonJointRecord.p.const("info", ""),

        nativeType = "NewtonUserBilateralGetInfoCallback"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonConstraintDestructor = Module.NEWTON.callback {
    void(
        "NewtonConstraintDestructor",
        "",

        NewtonJoint.const.p.const("me", ""),

        nativeType = "NewtonConstraintDestructor"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonJobTask = Module.NEWTON.callback {
    void(
        "NewtonJobTask",
        "",

        NewtonWorld.p.const("world", ""),
        void.p.const("userData", ""),
        int("threadIndex", ""),

        nativeType = "NewtonJobTask"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}

val NewtonReportProgress = Module.NEWTON.callback {
    int(
        "NewtonReportProgress",
        "",

        float("normalizedProgressPercent", ""),
        void.p.const("userData", ""),

        nativeType = "NewtonReportProgress"
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}