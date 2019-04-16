package newton.templates

import org.lwjgl.generator.*
import newton.*

val Newton = "Newton".nativeClass(Module.NEWTON, prefix = "NEWTON", prefixMethod = "Newton") {
    nativeDirective("""
        |#include "stdbool.h"
        |#include "Newton.h"
    """.trimMargin())

    javaImport(
        "static org.lwjgl.system.APIUtil.*"
    )

    IntConstant("", "MAJOR_VERSION".."3")
    IntConstant("", "MINOR_VERSION".."14")
    IntConstant("", "BROADPHASE_DEFAULT".."0")
    IntConstant("", "BROADPHASE_PERSINTENT".."1")
    IntConstant("", "DYNAMIC_BODY".."0")
    IntConstant("", "KINEMATIC_BODY".."1")
    IntConstant("", "DYNAMIC_ASYMETRIC_BODY".."2")
    IntConstant("", "SERIALIZE_ID_SPHERE".."0").noPrefix()
    IntConstant("", "SERIALIZE_ID_CAPSULE".."1").noPrefix()
    IntConstant("", "SERIALIZE_ID_CYLINDER".."2").noPrefix()
    IntConstant("", "SERIALIZE_ID_CHAMFERCYLINDER".."3").noPrefix()
    IntConstant("", "SERIALIZE_ID_BOX".."4").noPrefix()
    IntConstant("", "SERIALIZE_ID_CONE".."5").noPrefix()
    IntConstant("", "SERIALIZE_ID_CONVEXHULL".."6").noPrefix()
    IntConstant("", "SERIALIZE_ID_NULL".."7").noPrefix()
    IntConstant("", "SERIALIZE_ID_COMPOUND".."8").noPrefix()
    IntConstant("", "SERIALIZE_ID_TREE".."9").noPrefix()
    IntConstant("", "SERIALIZE_ID_HEIGHTFIELD".."10").noPrefix()
    IntConstant("", "SERIALIZE_ID_CLOTH_PATCH".."11").noPrefix()
    IntConstant("", "SERIALIZE_ID_DEFORMABLE_SOLID".."12").noPrefix()
    IntConstant("", "SERIALIZE_ID_USERMESH".."13").noPrefix()
    IntConstant("", "SERIALIZE_ID_SCENE".."14").noPrefix()
    IntConstant("", "SERIALIZE_ID_FRACTURED_COMPOUND".."15").noPrefix()

    int(
        "WorldGetVersion",
        "",

        void()
    )

    int(
        "WorldFloatSize",
        "",

        void()
    )

    int(
        "GetMemoryUsed",
        "",

        void()
    )

    void(
        "SetMemorySystem",
        "",

        NewtonAllocMemory("malloc", ""),
        NewtonFreeMemory("free", "")
    )

    NewtonWorld.p(
        "Create",
        "",

        void()
    )

    void(
        "Destroy",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "DestroyAllBodies",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    NewtonPostUpdateCallback(
        "GetPostUpdateCallback",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SetPostUpdateCallback",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonPostUpdateCallback("callback", "")
    )

    MapPointer("sizeInBytes")..void.p(
        "Alloc",
        "",

        int("sizeInBytes", "")
    )

    void(
        "Free",
        "",

        Check(1)..void.p.const("ptr", "")
    )
//
//    void(
//        "LoadPlugins",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("plugInPath", "")
//    )
//
//    void(
//        "UnloadPlugins",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void.p(
//        "CurrentPlugin",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void.p(
//        "GetFirstPlugin",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void.p(
//        "GetPreferedPlugin",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void.p(
//        "GetNextPlugin",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.const.p.const("plugin", "")
//    )
//
//    char.const.p(
//        "GetPluginString",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.const.p.const("plugin", "")
//    )
//
//    void(
//        "SelectPlugin",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.const.p.const("plugin", "")
//    )
//
//    float(
//        "GetContactMergeTolerance",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void(
//        "SetContactMergeTolerance",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float("tolerance", "")
//    )

    void(
        "InvalidateCache",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SetSolverIterations",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("model", "")
    )

    int(
        "GetSolverIterations",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SetParallelSolverOnLargeIsland",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("mode", "")
    )

    int(
        "GetParallelSolverOnLargeIsland",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    int(
        "GetBroadphaseAlgorithm",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SelectBroadphaseAlgorithm",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("algorithmType", "")
    )

    void(
        "ResetBroadphase",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "Update",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("timestep", "")
    )

    void(
        "UpdateAsync",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("timestep", "")
    )

    void(
        "WaitForUpdateToFinish",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    int(
        "GetNumberOfSubsteps",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SetNumberOfSubsteps",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("subSteps", "")
    )

    float(
        "GetLastUpdateTime",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

//    void(
//        "SerializeToFile",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("filename", ""),
//        NewtonOnBodySerializationCallback("bodyCallback", ""),
//        void.p.const("bodyUserData", "")
//    )
//
//    void(
//        "DeserializeFromFile",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("filename", ""),
//        NewtonOnBodyDeserializationCallback("bodyCallback", ""),
//        void.p.const("bodyUserData", "")
//    )
//
//    void(
//        "SerializeScene",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonOnBodySerializationCallback("bodyCallback", ""),
//        void.p.const("bodyUserData", ""),
//        NewtonSerializeCallback("serializeCallback", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    void(
//        "DeserializeScene",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonOnBodyDeserializationCallback("bodyCallback", ""),
//        void.p.const("bodyUserData", ""),
//        NewtonDeserializeCallback("serializeCallback", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    NewtonBody.p(
//        "FindSerializedBody",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("bodySerializedID", "")
//    )
//
//    void(
//        "SetJointSerializationCallbacks",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonOnJointSerializationCallback("serializeJoint", ""),
//        NewtonOnJointDeserializationCallback("deserializeJoint", "")
//    )
//
//    void(
//        "GetJointSerializationCallbacks",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonOnJointSerializationCallback.p.const("serializeJoint", ""),
//        NewtonOnJointDeserializationCallback.p.const("deserializeJoint", "")
//    )

    void(
        "WorldCriticalSectionLock",
        "multi threading interface",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("threadIndex", "")
    )

    void(
        "WorldCriticalSectionUnlock",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "SetThreadsCount",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("threads", "")
    )

    int(
        "GetThreadsCount",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    int(
        "GetMaxThreadsCount",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

//    void(
//        "DispachThreadJob",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonJobTask("task", ""),
//        void.p.const("usedData", ""),
//        char.const.p.const("functionName", "")
//    )

    void(
        "SyncThreadJobs",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

//    int(
//        "AtomicAdd",
//        "atomic operations",
//
//        int.p.const("ptr", ""),
//        int("value", "")
//    )
//
//    int(
//        "AtomicSwap",
//        "",
//
//        int.p.const("ptr", ""),
//        int("value", "")
//    )

    void(
        "Yield",
        "",

        void()
    )

//    void(
//        "SetIslandUpdateEvent",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonIslandUpdate("islandUpdate", "")
//    )
//
//    void(
//        "WorldForEachJointDo",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonJointIterator("callback", ""),
//        void.p.const("userData", "")
//    )
//
//    void(
//        "WorldForEachBodyInAABBDo",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("p0", ""),
//        float.const.p.const("p1", ""),
//        NewtonBodyIterator("callback", ""),
//        void.p.const("userData", "")
//    )
//
//    void(
//        "WorldSetUserData",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("userData", "")
//    )
//
//    void.p(
//        "WorldGetUserData",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void.p(
//        "WorldAddListener",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("nameId", ""),
//        void.p.const("listenerUserData", "")
//    )
//
//    void.p(
//        "WorldGetListener",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("nameId", "")
//    )
//
//    void(
//        "WorldListenerSetDestructorCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", ""),
//        NewtonWorldDestroyListenerCallback("destroy", "")
//    )
//
//    void(
//        "WorldListenerSetPreUpdateCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", ""),
//        NewtonWorldUpdateListenerCallback("update", "")
//    )
//
//    void(
//        "WorldListenerSetPostUpdateCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", ""),
//        NewtonWorldUpdateListenerCallback("update", "")
//    )
//
//    void(
//        "WorldListenerSetDebugCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", ""),
//        NewtonWorldListenerDebugCallback("debugCallback", "")
//    )
//
//    void(
//        "WorldListenerSetBodyDestroyCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", ""),
//        NewtonWorldListenerBodyDestroyCallback("bodyDestroyCallback", "")
//    )
//
//    void(
//        "WorldListenerDebug",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("context", "")
//    )
//
//    void.p(
//        "WorldGetListenerUserData",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", "")
//    )
//
//    NewtonWorldListenerBodyDestroyCallback(
//        "WorldListenerGetBodyDestroyCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        void.p.const("listener", "")
//    )
//
//    void(
//        "WorldSetDestructorCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonWorldDestructorCallback("destructor", "")
//    )
//
//    NewtonWorldDestructorCallback(
//        "WorldGetDestructorCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void(
//        "WorldSetCollisionConstructorDestructorCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonCollisionCopyConstructionCallback("constructor", ""),
//        NewtonCollisionDestructorCallback("destructor", "")
//    )
//
//    void(
//        "WorldRayCast",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("p0", ""),
//        float.const.p.const("p1", ""),
//        NewtonWorldRayFilterCallback("filter", ""),
//        void.p.const("userData", ""),
//        NewtonWorldRayPrefilterCallback("prefilter", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "WorldConvexCast",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("matrix", ""),
//        float.const.p.const("target", ""),
//        NewtonCollision.const.p.const("shape", ""),
//        float.p.const("param", ""),
//        void.p.const("userData", ""),
//        NewtonWorldRayPrefilterCallback("prefilter", ""),
//        NewtonWorldConvexCastReturnInfo.p.const("info", ""),
//        int("maxContactsCount", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "WorldCollide",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("matrix", ""),
//        NewtonCollision.const.p.const("shape", ""),
//        void.p.const("userData", ""),
//        NewtonWorldRayPrefilterCallback("prefilter", ""),
//        NewtonWorldConvexCastReturnInfo.p.const("info", ""),
//        int("maxContactsCount", ""),
//        int("threadIndex", "")
//    )
//
    int(
        "WorldGetBodyCount",
        "world utility functions",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    int(
        "WorldGetConstraintCount",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

//    NewtonBody.p(
//        "IslandGetBody",
//        "",
//
//        void.const.p.const("island", ""),
//        int("bodyIndex", "")
//    )
//
//    void(
//        "IslandGetBodyAABB",
//        "",
//
//        void.const.p.const("island", ""),
//        int("bodyIndex", ""),
//        float.p.const("p0", ""),
//        float.p.const("p1", "")
//    )

    int(
        "MaterialCreateGroupID",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    int(
        "MaterialGetDefaultGroupID",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

    void(
        "MaterialDestroyAllGroupID",
        "",

        NewtonWorld.const.p.const("newtonWorld", "")
    )

//    void.p(
//        "MaterialGetUserData",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("id0", ""),
//        int("id1", "")
//    )

    void(
        "MaterialSetSurfaceThickness",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("id0", ""),
        int("id1", ""),
        float("thickness", "")
    )

//    void(
//        "MaterialSetCallbackUserData",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("id0", ""),
//        int("id1", ""),
//        void.p.const("userData", "")
//    )
//
//    void(
//        "MaterialSetContactGenerationCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("id0", ""),
//        int("id1", ""),
//        NewtonOnContactGeneration("contactGeneration", "")
//    )
//
//    void(
//        "MaterialSetCompoundCollisionCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("id0", ""),
//        int("id1", ""),
//        NewtonOnCompoundSubCollisionAABBOverlap("compoundAabbOverlap", "")
//    )
//
//    void(
//        "MaterialSetCollisionCallback",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("id0", ""),
//        int("id1", ""),
//        NewtonOnAABBOverlap("aabbOverlap", ""),
//        NewtonContactsProcess("process", "")
//    )

    void(
        "MaterialSetDefaultSoftness",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("id0", ""),
        int("id1", ""),
        float("value", "")
    )

    void(
        "MaterialSetDefaultElasticity",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("id0", ""),
        int("id1", ""),
        float("elasticCoef", "")
    )

    void(
        "MaterialSetDefaultCollidable",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("id0", ""),
        int("id1", ""),
        int("state", "")
    )

    void(
        "MaterialSetDefaultFriction",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        int("id0", ""),
        int("id1", ""),
        float("staticFriction", ""),
        float("kineticFriction", "")
    )

//    NewtonMaterial.p(
//        "WorldGetFirstMaterial",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    NewtonMaterial.p(
//        "WorldGetNextMaterial",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    NewtonBody.p(
//        "WorldGetFirstBody",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    NewtonBody.p(
//        "WorldGetNextBody",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonBody.const.p.const("curBody", "")
//    )
//
//    void.p(
//        "MaterialGetMaterialPairUserData",
//        "",
//
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    unsigned_int(
//        "MaterialGetContactFaceAttribute",
//        "",
//
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    NewtonCollision.p(
//        "MaterialGetBodyCollidingShape",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        NewtonBody.const.p.const("body", "")
//    )
//
//    float(
//        "MaterialGetContactNormalSpeed",
//        "",
//
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    void(
//        "MaterialGetContactForce",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("force", "")
//    )
//
//    void(
//        "MaterialGetContactPositionAndNormal",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("posit", ""),
//        float.p.const("normal", "")
//    )
//
//    void(
//        "MaterialGetContactTangentDirections",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("dir0", ""),
//        float.p.const("dir1", "")
//    )
//
//    float(
//        "MaterialGetContactTangentSpeed",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        int("index", "")
//    )
//
//    float(
//        "MaterialGetContactMaxNormalImpact",
//        "",
//
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    float(
//        "MaterialGetContactMaxTangentImpact",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        int("index", "")
//    )
//
//    float(
//        "MaterialGetContactPenetration",
//        "",
//
//        NewtonMaterial.const.p.const("material", "")
//    )
//
//    void(
//        "MaterialSetContactSoftness",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("softness", "")
//    )
//
//    void(
//        "MaterialSetContactThickness",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("thickness", "")
//    )
//
//    void(
//        "MaterialSetContactElasticity",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("restitution", "")
//    )
//
//    void(
//        "MaterialSetContactFrictionState",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        int("state", ""),
//        int("index", "")
//    )
//
//    void(
//        "MaterialSetContactFrictionCoef",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("staticFrictionCoef", ""),
//        float("kineticFrictionCoef", ""),
//        int("index", "")
//    )
//
//    void(
//        "MaterialSetContactNormalAcceleration",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("accel", "")
//    )
//
//    void(
//        "MaterialSetContactNormalDirection",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float.const.p.const("directionVector", "")
//    )
//
//    void(
//        "MaterialSetContactPosition",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float.const.p.const("position", "")
//    )
//
//    void(
//        "MaterialSetContactTangentFriction",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("friction", ""),
//        int("index", "")
//    )
//
//    void(
//        "MaterialSetContactTangentAcceleration",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float("accel", ""),
//        int("index", "")
//    )
//
//    void(
//        "MaterialContactRotateTangentDirections",
//        "",
//
//        NewtonMaterial.const.p.const("material", ""),
//        float.const.p.const("directionVector", "")
//    )
//
//    float(
//        "MaterialGetContactPruningTolerance",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    void(
//        "MaterialSetContactPruningTolerance",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", ""),
//        float("tolerance", "")
//    )
//
//    NewtonCollision.p(
//        "CreateNull",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )

    NewtonCollision.p(
        "CreateSphere",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("radius", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")   // TODO Nullable
    )

    NewtonCollision.p(
        "CreateBox",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("dx", ""),
        float("dy", ""),
        float("dz", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")
    )

    NewtonCollision.p(
        "CreateCone",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("radius", ""),
        float("height", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")
    )

    NewtonCollision.p(
        "CreateCapsule",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("radius0", ""),
        float("radius1", ""),
        float("height", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")
    )

    NewtonCollision.p(
        "CreateCylinder",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("radio0", ""),
        float("radio1", ""),
        float("height", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")
    )

    NewtonCollision.p(
        "CreateChamferCylinder",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        float("radius", ""),
        float("height", ""),
        int("shapeID", ""),
        Check(16)..float.const.p.const("offsetMatrix", "")
    )

//    NewtonCollision.p(
//        "CreateConvexHull",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("count", ""),
//        float.const.p.const("vertexCloud", ""),
//        int("strideInBytes", ""),
//        float("tolerance", ""),
//        int("shapeID", ""),
//        Check(16)..float.const.p.const("offsetMatrix", "")
//    )
//
//    NewtonCollision.p(
//        "CreateConvexHullFromMesh",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMesh.const.p.const("mesh", ""),
//        float("tolerance", ""),
//        int("shapeID", "")
//    )

    int(
        "CollisionGetMode",
        "",

        NewtonCollision.const.p.const("convexCollision", "")
    )

    void(
        "CollisionSetMode",
        "",

        NewtonCollision.const.p.const("convexCollision", ""),
        int("mode", "")
    )

//    int(
//        "ConvexHullGetFaceIndices",
//        "",
//
//        NewtonCollision.const.p.const("convexHullCollision", ""),
//        int("face", ""),
//        int.p.const("faceIndices", "")
//    )
//
//    int(
//        "ConvexHullGetVertexData",
//        "",
//
//        NewtonCollision.const.p.const("convexHullCollision", ""),
//        float.p.p.const("vertexData", ""),
//        int.p("strideInBytes", "")
//    )
//
//    float(
//        "ConvexCollisionCalculateVolume",
//        "",
//
//        NewtonCollision.const.p.const("convexCollision", "")
//    )
//
//    void(
//        "ConvexCollisionCalculateInertialMatrix",
//        "",
//
//        NewtonCollision.const.p("convexCollision", ""),
//        float.p.const("inertia", ""),
//        float.p.const("origin", "")
//    )
//
//    void(
//        "ConvexCollisionCalculateBuoyancyAcceleration",
//        "",
//
//        NewtonCollision.const.p.const("convexCollision", ""),
//        float.const.p.const("matrix", ""),
//        float.const.p.const("shapeOrigin", ""),
//        float.const.p.const("gravityVector", ""),
//        float.const.p.const("fluidPlane", ""),
//        float("fluidDensity", ""),
//        float("fluidViscosity", ""),
//        float.p.const("accel", ""),
//        float.p.const("alpha", "")
//    )
//
//    void.const.p(
//        "CollisionDataPointer",
//        "",
//
//        NewtonCollision.const.p.const("convexCollision", "")
//    )
//
//    NewtonCollision.p(
//        "CreateCompoundCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("shapeID", "")
//    )
//
//    NewtonCollision.p(
//        "CreateCompoundCollisionFromMesh",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMesh.const.p.const("mesh", ""),
//        float("hullTolerance", ""),
//        int("shapeID", ""),
//        int("subShapeID", "")
//    )
//
//    void(
//        "CompoundCollisionBeginAddRemove",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", "")
//    )
//
//    void.p(
//        "CompoundCollisionAddSubCollision",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        NewtonCollision.const.p.const("convexCollision", "")
//    )
//
//    void(
//        "CompoundCollisionRemoveSubCollision",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    void(
//        "CompoundCollisionRemoveSubCollisionByIndex",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        int("nodeIndex", "")
//    )
//
//    void(
//        "CompoundCollisionSetSubCollisionMatrix",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", ""),
//        float.const.p.const("matrix", "")
//    )
//
//    void(
//        "CompoundCollisionEndAddRemove",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", "")
//    )
//
//    void.p(
//        "CompoundCollisionGetFirstNode",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", "")
//    )
//
//    void.p(
//        "CompoundCollisionGetNextNode",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    void.p(
//        "CompoundCollisionGetNodeByIndex",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        int("index", "")
//    )
//
//    int(
//        "CompoundCollisionGetNodeIndex",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    NewtonCollision.p(
//        "CompoundCollisionGetCollisionFromNode",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    NewtonCollision.p(
//        "CreateFracturedCompoundCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMesh.const.p.const("solidMesh", ""),
//        int("shapeID", ""),
//        int("fracturePhysicsMaterialID", ""),
//        int("pointcloudCount", ""),
//        float.const.p.const("vertexCloud", ""),
//        int("strideInBytes", ""),
//        int("materialID", ""),
//        float.const.p.const("textureMatrix", ""),
//        NewtonFractureCompoundCollisionReconstructMainMeshCallBack("regenerateMainMeshCallback", ""),
//        NewtonFractureCompoundCollisionOnEmitCompoundFractured("emitFracturedCompound", ""),
//        NewtonFractureCompoundCollisionOnEmitChunk("emitFracfuredChunk", "")
//    )
//
//    NewtonCollision.p(
//        "FracturedCompoundPlaneClip",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        float.const.p.const("plane", "")
//    )
//
//    void(
//        "FracturedCompoundSetCallbacks",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFractureCompoundCollisionReconstructMainMeshCallBack("regenerateMainMeshCallback", ""),
//        NewtonFractureCompoundCollisionOnEmitCompoundFractured("emitFracturedCompound", ""),
//        NewtonFractureCompoundCollisionOnEmitChunk("emitFracfuredChunk", "")
//    )
//
//    int(
//        "FracturedCompoundIsNodeFreeToDetach",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        void.p.const("collisionNode", "")
//    )
//
//    int(
//        "FracturedCompoundNeighborNodeList",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        void.p.const("collisionNode", ""),
//        void.p.p.const("list", ""),
//        int("maxCount", "")
//    )
//
//    NewtonFracturedCompoundMeshPart.p(
//        "FracturedCompoundGetMainMesh",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", "")
//    )
//
//    NewtonFracturedCompoundMeshPart.p(
//        "FracturedCompoundGetFirstSubMesh",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", "")
//    )
//
//    NewtonFracturedCompoundMeshPart.p(
//        "FracturedCompoundGetNextSubMesh",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.p.const("subMesh", "")
//    )
//
//    int(
//        "FracturedCompoundCollisionGetVertexCount",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.const.p.const("meshOwner", "")
//    )
//
//    float.const.p(
//        "FracturedCompoundCollisionGetVertexPositions",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.const.p.const("meshOwner", "")
//    )
//
//    float.const.p(
//        "FracturedCompoundCollisionGetVertexNormals",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.const.p.const("meshOwner", "")
//    )
//
//    float.const.p(
//        "FracturedCompoundCollisionGetVertexUVs",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.const.p.const("meshOwner", "")
//    )
//
//    int(
//        "FracturedCompoundMeshPartGetIndexStream",
//        "",
//
//        NewtonCollision.const.p.const("fracturedCompound", ""),
//        NewtonFracturedCompoundMeshPart.const.p.const("meshOwner", ""),
//        void.const.p.const("segment", ""),
//        int.p.const("index", "")
//    )
//
//    void.p(
//        "FracturedCompoundMeshPartGetFirstSegment",
//        "",
//
//        NewtonFracturedCompoundMeshPart.const.p.const("fractureCompoundMeshPart", "")
//    )
//
//    void.p(
//        "FracturedCompoundMeshPartGetNextSegment",
//        "",
//
//        void.const.p.const("fractureCompoundMeshSegment", "")
//    )
//
//    int(
//        "FracturedCompoundMeshPartGetMaterial",
//        "",
//
//        void.const.p.const("fractureCompoundMeshSegment", "")
//    )
//
//    int(
//        "FracturedCompoundMeshPartGetIndexCount",
//        "",
//
//        void.const.p.const("fractureCompoundMeshSegment", "")
//    )
//
//    NewtonCollision.p(
//        "CreateSceneCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("shapeID", "")
//    )
//
//    void(
//        "SceneCollisionBeginAddRemove",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", "")
//    )
//
//    void.p(
//        "SceneCollisionAddSubCollision",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        NewtonCollision.const.p.const("collision", "")
//    )
//
//    void(
//        "SceneCollisionRemoveSubCollision",
//        "",
//
//        NewtonCollision.p.const("compoundCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    void(
//        "SceneCollisionRemoveSubCollisionByIndex",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        int("nodeIndex", "")
//    )
//
//    void(
//        "SceneCollisionSetSubCollisionMatrix",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        void.const.p.const("collisionNode", ""),
//        float.const.p.const("matrix", "")
//    )
//
//    void(
//        "SceneCollisionEndAddRemove",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", "")
//    )
//
//    void.p(
//        "SceneCollisionGetFirstNode",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", "")
//    )
//
//    void.p(
//        "SceneCollisionGetNextNode",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    void.p(
//        "SceneCollisionGetNodeByIndex",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        int("index", "")
//    )
//
//    int(
//        "SceneCollisionGetNodeIndex",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    NewtonCollision.p(
//        "SceneCollisionGetCollisionFromNode",
//        "",
//
//        NewtonCollision.p.const("sceneCollision", ""),
//        void.const.p.const("collisionNode", "")
//    )
//
//    NewtonCollision.p(
//        "CreateUserMeshCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("minBox", ""),
//        float.const.p.const("maxBox", ""),
//        void.p.const("userData", ""),
//        NewtonUserMeshCollisionCollideCallback("collideCallback", ""),
//        NewtonUserMeshCollisionRayHitCallback("rayHitCallback", ""),
//        NewtonUserMeshCollisionDestroyCallback("destroyCallback", ""),
//        NewtonUserMeshCollisionGetCollisionInfo("getInfoCallback", ""),
//        NewtonUserMeshCollisionAABBTest("getLocalAABBCallback", ""),
//        NewtonUserMeshCollisionGetFacesInAABB("facesInAABBCallback", ""),
//        NewtonOnUserCollisionSerializationCallback("serializeCallback", ""),
//        int("shapeID", "")
//    )
//
//    int(
//        "UserMeshCollisionContinuousOverlapTest",
//        "",
//
//        NewtonUserMeshCollisionCollideDesc.const.p.const("collideDescData", ""),
//        void.const.p.const("continueCollisionHandle", ""),
//        float.const.p.const("minAabb", ""),
//        float.const.p.const("maxAabb", "")
//    )
//
//    NewtonCollision.p(
//        "CreateCollisionFromSerialization",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonDeserializeCallback("deserializeFunction", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    void(
//        "CollisionSerialize",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonCollision.const.p.const("collision", ""),
//        NewtonSerializeCallback("serializeFunction", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    void(
//        "CollisionGetInfo",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        NewtonCollisionInfoRecord.p.const("collisionInfo", "")
//    )
//
//    NewtonCollision.p(
//        "CreateHeightFieldCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("width", ""),
//        int("height", ""),
//        int("gridsDiagonals", ""),
//        int("elevationdatType", ""),
//        void.const.p.const("elevationMap", ""),
//        char.const.p.const("attributeMap", ""),
//        float("verticalScale", ""),
//        float("horizontalScale_x", ""),
//        float("horizontalScale_z", ""),
//        int("shapeID", "")
//    )
//
//    void(
//        "HeightFieldSetUserRayCastCallback",
//        "",
//
//        NewtonCollision.const.p.const("heightfieldCollision", ""),
//        NewtonHeightFieldRayCastCallback("rayHitCallback", "")
//    )
//
//    void(
//        "HeightFieldSetHorizontalDisplacement",
//        "",
//
//        NewtonCollision.const.p.const("heightfieldCollision", ""),
//        unsigned_short.const.p.const("horizontalMap", ""),
//        float("scale", "")
//    )
//
//    NewtonCollision.p(
//        "CreateTreeCollision",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("shapeID", "")
//    )
//
//    NewtonCollision.p(
//        "CreateTreeCollisionFromMesh",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMesh.const.p.const("mesh", ""),
//        int("shapeID", "")
//    )
//
//    void(
//        "TreeCollisionSetUserRayCastCallback",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        NewtonCollisionTreeRayCastCallback("rayHitCallback", "")
//    )
//
//    void(
//        "TreeCollisionBeginBuild",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", "")
//    )
//
//    void(
//        "TreeCollisionAddFace",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        int("vertexCount", ""),
//        float.const.p.const("vertexPtr", ""),
//        int("strideInBytes", ""),
//        int("faceAttribute", "")
//    )
//
//    void(
//        "TreeCollisionEndBuild",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        int("optimize", "")
//    )
//
//    int(
//        "TreeCollisionGetFaceAttribute",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        int.const.p.const("faceIndexArray", ""),
//        int("indexCount", "")
//    )
//
//    void(
//        "TreeCollisionSetFaceAttribute",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        int.const.p.const("faceIndexArray", ""),
//        int("indexCount", ""),
//        int("attribute", "")
//    )
//
//    void(
//        "TreeCollisionForEachFace",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        NewtonTreeCollisionFaceCallback("forEachFaceCallback", ""),
//        void.p.const("context", "")
//    )
//
//    int(
//        "TreeCollisionGetVertexListTriangleListInAABB",
//        "",
//
//        NewtonCollision.const.p.const("treeCollision", ""),
//        float.const.p.const("p0", ""),
//        float.const.p.const("p1", ""),
//        float.const.p.p.const("vertexArray", ""),
//        int.p.const("vertexCount", ""),
//        int.p.const("vertexStrideInBytes", ""),
//        int.const.p.const("indexList", ""),
//        int("maxIndexCount", ""),
//        int.const.p.const("faceAttribute", "")
//    )
//
//    void(
//        "StaticCollisionSetDebugCallback",
//        "",
//
//        NewtonCollision.const.p.const("staticCollision", ""),
//        NewtonTreeCollisionCallback("userCallback", "")
//    )

    NewtonCollision.p(
        "CollisionCreateInstance",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

    int(
        "CollisionGetType",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

    int(
        "CollisionIsConvexShape",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

    int(
        "CollisionIsStaticShape",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

//    void(
//        "CollisionSetUserData",
//        "for the end user",
//
//        NewtonCollision.const.p.const("collision", ""),
//        void.p.const("userData", "")
//    )
//
//    void.p(
//        "CollisionGetUserData",
//        "",
//
//        NewtonCollision.const.p.const("collision", "")
//    )

    void(
        "CollisionSetUserID",
        "",

        NewtonCollision.const.p.const("collision", ""),
        unsigned_int("id", "")
    )

    unsigned_int(
        "CollisionGetUserID",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

//    void(
//        "CollisionGetMaterial",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        NewtonCollisionMaterial.p.const("userData", "")
//    )
//
//    void(
//        "CollisionSetMaterial",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        NewtonCollisionMaterial.const.p.const("userData", "")
//    )
//
//    void.p(
//        "CollisionGetSubCollisionHandle",
//        "",
//
//        NewtonCollision.const.p.const("collision", "")
//    )
//
//    NewtonCollision.p(
//        "CollisionGetParentInstance",
//        "",
//
//        NewtonCollision.const.p.const("collision", "")
//    )

    void(
        "CollisionSetMatrix",
        "",

        NewtonCollision.const.p.const("collision", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    void(
        "CollisionGetMatrix",
        "",

        NewtonCollision.const.p.const("collision", ""),
        Check(16)..float.p.const("matrix", "")
    )

    void(
        "CollisionSetScale",
        "",

        NewtonCollision.const.p.const("collision", ""),
        float("scaleX", ""),
        float("scaleY", ""),
        float("scaleZ", "")
    )

    void(
        "CollisionGetScale",
        "",

        NewtonCollision.const.p.const("collision", ""),
        Check(1)..float.p.const("scaleX", ""),
        Check(1)..float.p.const("scaleY", ""),
        Check(1).. float.p.const("scaleZ", "")
    )

    void(
        "DestroyCollision",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

    float(
        "CollisionGetSkinThickness",
        "",

        NewtonCollision.const.p.const("collision", "")
    )

    void(
        "CollisionSetSkinThickness",
        "",

        NewtonCollision.const.p.const("collision", ""),
        float("thickness", "")
    )

//    int(
//        "CollisionIntersectionTest",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonCollision.const.p.const("collisionA", ""),
//        float.const.p.const("matrixA", ""),
//        NewtonCollision.const.p.const("collisionB", ""),
//        float.const.p.const("matrixB", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "CollisionPointDistance",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p.const("point", ""),
//        NewtonCollision.const.p.const("collision", ""),
//        float.const.p.const("matrix", ""),
//        float.p.const("contact", ""),
//        float.p.const("normal", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "CollisionClosestPoint",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonCollision.const.p.const("collisionA", ""),
//        float.const.p.const("matrixA", ""),
//        NewtonCollision.const.p.const("collisionB", ""),
//        float.const.p.const("matrixB", ""),
//        float.p.const("contactA", ""),
//        float.p.const("contactB", ""),
//        float.p.const("normalAB", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "CollisionCollide",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("maxSize", ""),
//        NewtonCollision.const.p.const("collisionA", ""),
//        float.const.p.const("matrixA", ""),
//        NewtonCollision.const.p.const("collisionB", ""),
//        float.const.p.const("matrixB", ""),
//        float.p.const("contacts", ""),
//        float.p.const("normals", ""),
//        float.p.const("penetration", ""),
//        long_long.p.const("attributeA", ""),
//        long_long.p.const("attributeB", ""),
//        int("threadIndex", "")
//    )
//
//    int(
//        "CollisionCollideContinue",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("maxSize", ""),
//        float("timestep", ""),
//        NewtonCollision.const.p.const("collisionA", ""),
//        float.const.p.const("matrixA", ""),
//        float.const.p.const("velocA", ""),
//        float.const.p("omegaA", ""),
//        NewtonCollision.const.p.const("collisionB", ""),
//        float.const.p.const("matrixB", ""),
//        float.const.p.const("velocB", ""),
//        float.const.p.const("omegaB", ""),
//        float.p.const("timeOfImpact", ""),
//        float.p.const("contacts", ""),
//        float.p.const("normals", ""),
//        float.p.const("penetration", ""),
//        long_long.p.const("attributeA", ""),
//        long_long.p.const("attributeB", ""),
//        int("threadIndex", "")
//    )
//
//    void(
//        "CollisionSupportVertex",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        float.const.p.const("dir", ""),
//        float.p.const("vertex", "")
//    )
//
//    float(
//        "CollisionRayCast",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        float.const.p.const("p0", ""),
//        float.const.p.const("p1", ""),
//        float.p.const("normal", ""),
//        long_long.p.const("attribute", "")
//    )
//
//    void(
//        "CollisionCalculateAABB",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        float.const.p.const("matrix", ""),
//        float.p.const("p0", ""),
//        float.p.const("p1", "")
//    )
//
//    void(
//        "CollisionForEachPolygonDo",
//        "",
//
//        NewtonCollision.const.p.const("collision", ""),
//        float.const.p.const("matrix", ""),
//        NewtonCollisionIterator("callback", ""),
//        void.p.const("userData", "")
//    )
//
//    void.p(
//        "CollisionAggregateCreate",
//        "",
//
//        NewtonWorld.p.const("world", "")
//    )
//
//    void(
//        "CollisionAggregateDestroy",
//        "",
//
//        void.p.const("aggregate", "")
//    )
//
//    void(
//        "CollisionAggregateAddBody",
//        "",
//
//        void.p.const("aggregate", ""),
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "CollisionAggregateRemoveBody",
//        "",
//
//        void.p.const("aggregate", ""),
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "CollisionAggregateGetSelfCollision",
//        "",
//
//        void.p.const("aggregate", "")
//    )
//
//    void(
//        "CollisionAggregateSetSelfCollision",
//        "",
//
//        void.p.const("aggregate", ""),
//        int("state", "")
//    )
//
//    void(
//        "SetEulerAngle",
//        "",
//
//        float.const.p.const("eulersAngles", ""),
//        float.p.const("matrix", "")
//    )
//
//    void(
//        "GetEulerAngle",
//        "",
//
//        float.const.p.const("matrix", ""),
//        float.p.const("eulersAngles0", ""),
//        float.p.const("eulersAngles1", "")
//    )
//
//    float(
//        "CalculateSpringDamperAcceleration",
//        "",
//
//        float("dt", ""),
//        float("ks", ""),
//        float("x", ""),
//        float("kd", ""),
//        float("s", "")
//    )

    NewtonBody.p(
        "CreateDynamicBody",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonCollision.const.p.const("collision", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    NewtonBody.p(
        "CreateKinematicBody",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonCollision.const.p.const("collision", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    NewtonBody.p(
        "CreateAsymetricDynamicBody",
        "",

        NewtonWorld.const.p.const("newtonWorld", ""),
        NewtonCollision.const.p.const("collision", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    void(
        "DestroyBody",
        "",

        NewtonBody.const.p.const("body", "")
    )

    int(
        "BodyGetSimulationState",
        "",

        NewtonBody.const.p.const("body", "")
    )

    void(
        "BodySetSimulationState",
        "",

        NewtonBody.const.p.const("bodyPtr", ""),
        int.const("state", "")
    )

    int(
        "BodyGetType",
        "",

        NewtonBody.const.p.const("body", "")
    )

    int(
        "BodyGetCollidable",
        "",

        NewtonBody.const.p.const("body", "")
    )

    void(
        "BodySetCollidable",
        "",

        NewtonBody.const.p.const("body", ""),
        int("collidableState", "")
    )

    void(
        "BodyAddForce",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("force", "")
    )

    void(
        "BodyAddTorque",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("torque", "")
    )

    void(
        "BodyCalculateInverseDynamicsForce",
        "",

        NewtonBody.const.p.const("body", ""),
        float("timestep", ""),
        Check(3)..float.const.p.const("desiredVeloc", ""),
        Check(3)..float.p.const("forceOut", "")
    )

    void(
        "BodySetCentreOfMass",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("com", "")
    )

    void(
        "BodySetMassMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        float("mass", ""),
        float("Ixx", ""),
        float("Iyy", ""),
        float("Izz", "")
    )

    void(
        "BodySetFullMassMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        float("mass", ""),
        Check(16)..float.const.p.const("inertiaMatrix", "")
    )

    void(
        "BodySetMassProperties",
        "",

        NewtonBody.const.p.const("body", ""),
        float("mass", ""),
        NewtonCollision.const.p.const("collision", "")
    )

    void(
        "BodySetMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    void(
        "BodySetMatrixNoSleep",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    void(
        "BodySetMatrixRecursive",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.const.p.const("matrix", "")
    )

    void(
        "BodySetMaterialGroupID",
        "",

        NewtonBody.const.p.const("body", ""),
        int("id", "")
    )

    void(
        "BodySetContinuousCollisionMode",
        "",

        NewtonBody.const.p.const("body", ""),
        unsigned_int("state", "")
    )

    void(
        "BodySetJointRecursiveCollision",
        "",

        NewtonBody.const.p.const("body", ""),
        unsigned_int("state", "")
    )

    void(
        "BodySetOmega",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("omega", "")
    )

    void(
        "BodySetOmegaNoSleep",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("omega", "")
    )

    void(
        "BodySetVelocity",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("velocity", "")
    )

    void(
        "BodySetVelocityNoSleep",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("velocity", "")
    )

    void(
        "BodySetForce",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3).. float.const.p.const("force", "")
    )

    void(
        "BodySetTorque",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("torque", "")
    )

    void(
        "BodySetLinearDamping",
        "",

        NewtonBody.const.p.const("body", ""),
        float("linearDamp", "")
    )

    void(
        "BodySetAngularDamping",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.const.p.const("angularDamp", "")
    )

    void(
        "BodySetCollision",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonCollision.const.p.const("collision", "")
    )

    void(
        "BodySetCollisionScale",
        "",

        NewtonBody.const.p.const("body", ""),
        float("scaleX", ""),
        float("scaleY", ""),
        float("scaleZ", "")
    )

//    int(
//        "BodyGetSleepState",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "BodySetSleepState",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        int("state", "")
//    )
//
//    int(
//        "BodyGetAutoSleep",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "BodySetAutoSleep",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        int("state", "")
//    )
//
//    int(
//        "BodyGetFreezeState",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "BodySetFreezeState",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        int("state", "")
//    )
//
//    void(
//        "BodySetDestructorCallback",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        NewtonBodyDestructor("callback", "")
//    )
//
//    NewtonBodyDestructor(
//        "BodyGetDestructorCallback",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "BodySetTransformCallback",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        NewtonSetTransform("callback", "")
//    )
//
//    NewtonSetTransform(
//        "BodyGetTransformCallback",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
    void(
        "BodySetForceAndTorqueCallback",
        "",

        NewtonBody.const.p.const("body", ""),
        NewtonApplyForceAndTorque("callback", "")
    )
//
//    NewtonApplyForceAndTorque(
//        "BodyGetForceAndTorqueCallback",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "BodyGetID",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "BodySetUserData",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        void.p.const("userData", "")
//    )
//
//    void.p(
//        "BodyGetUserData",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    NewtonWorld.p(
//        "BodyGetWorld",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    NewtonCollision.p(
//        "BodyGetCollision",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "BodyGetMaterialGroupID",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "BodyGetSerializedID",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "BodyGetContinuousCollisionMode",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    int(
//        "BodyGetJointRecursiveCollision",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )

    void(
        "BodyGetPosition",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("pos", "")
    )

    void(
        "BodyGetMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.p.const("matrix", "")
    )

    void(
        "BodyGetRotation",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(4)..float.p.const("rotation", "")
    )

    void(
        "BodyGetMass",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(1)..float.p("mass", ""),
        Check(1)..float.p.const("Ixx", ""),
        Check(1)..float.p.const("Iyy", ""),
        Check(1)..float.p.const("Izz", "")
    )

    void(
        "BodyGetInvMass",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(1)..float.p.const("invMass", ""),
        Check(1)..float.p.const("invIxx", ""),
        Check(1)..float.p.const("invIyy", ""),
        Check(1)..float.p.const("invIzz", "")
    )

    void(
        "BodyGetInertiaMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.p.const("inertiaMatrix", "")
    )

    void(
        "BodyGetInvInertiaMatrix",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(16)..float.p.const("invInertiaMatrix", "")
    )

    void(
        "BodyGetOmega",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

    void(
        "BodyGetVelocity",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

//    void(
//        "BodyGetAlpha",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("vector", "")
//    )

    void(
        "BodyGetAcceleration",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

    void(
        "BodyGetForce",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

    void(
        "BodyGetTorque",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

    void(
        "BodyGetCentreOfMass",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("com", "")
    )

//    void(
//        "BodyGetPointVelocity",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        float.const.p.const("point", ""),
//        float.p.const("velocOut", "")
//    )
//
//    void(
//        "BodyApplyImpulsePair",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("linearImpulse", ""),
//        float.p.const("angularImpulse", ""),
//        float("timestep", "")
//    )
//
//    void(
//        "BodyAddImpulse",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        float.const.p.const("pointDeltaVeloc", ""),
//        float.const.p.const("pointPosit", ""),
//        float("timestep", "")
//    )
//
//    void(
//        "BodyApplyImpulseArray",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        int("impuleCount", ""),
//        int("strideInByte", ""),
//        float.const.p.const("impulseArray", ""),
//        float.const.p.const("pointArray", ""),
//        float("timestep", "")
//    )

    void(
        "BodyIntegrateVelocity",
        "",

        NewtonBody.const.p.const("body", ""),
        float("timestep", "")
    )

    float(
        "BodyGetLinearDamping",
        "",

        NewtonBody.const.p.const("body", "")
    )

    void(
        "BodyGetAngularDamping",
        "",

        NewtonBody.const.p.const("body", ""),
        Check(3)..float.p.const("vector", "")
    )

//    void(
//        "BodyGetAABB",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        float.p.const("p0", ""),
//        float.p.const("p1", "")
//    )
//
//    NewtonJoint.p(
//        "BodyGetFirstJoint",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    NewtonJoint.p(
//        "BodyGetNextJoint",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    NewtonJoint.p(
//        "BodyGetFirstContactJoint",
//        "",
//
//        NewtonBody.const.p.const("body", "")
//    )
//
//    NewtonJoint.p(
//        "BodyGetNextContactJoint",
//        "",
//
//        NewtonBody.const.p.const("body", ""),
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    NewtonJoint.p(
//        "BodyFindContact",
//        "",
//
//        NewtonBody.const.p.const("body0", ""),
//        NewtonBody.const.p.const("body1", "")
//    )
//
//    void.p(
//        "ContactJointGetFirstContact",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    void.p(
//        "ContactJointGetNextContact",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", ""),
//        void.p.const("contact", "")
//    )
//
//    int(
//        "ContactJointGetContactCount",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    void(
//        "ContactJointRemoveContact",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", ""),
//        void.p.const("contact", "")
//    )
//
//    float(
//        "ContactJointGetClosestDistance",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    void(
//        "ContactJointResetSelftJointCollision",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    void(
//        "ContactJointResetIntraJointCollision",
//        "",
//
//        NewtonJoint.const.p.const("contactJoint", "")
//    )
//
//    NewtonMaterial.p(
//        "ContactGetMaterial",
//        "",
//
//        void.const.p.const("contact", "")
//    )
//
//    NewtonCollision.p(
//        "ContactGetCollision0",
//        "",
//
//        void.const.p.const("contact", "")
//    )
//
//    NewtonCollision.p(
//        "ContactGetCollision1",
//        "",
//
//        void.const.p.const("contact", "")
//    )
//
//    void.p(
//        "ContactGetCollisionID0",
//        "",
//
//        void.const.p.const("contact", "")
//    )
//
//    void.p(
//        "ContactGetCollisionID1",
//        "",
//
//        void.const.p.const("contact", "")
//    )
//
//    void.p(
//        "JointGetUserData",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "JointSetUserData",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        void.p.const("userData", "")
//    )
//
//    NewtonBody.p(
//        "JointGetBody0",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    NewtonBody.p(
//        "JointGetBody1",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "JointGetInfo",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        NewtonJointRecord.p.const("info", "")
//    )
//
//    int(
//        "JointGetCollisionState",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "JointSetCollisionState",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        int("state", "")
//    )
//
//    float(
//        "JointGetStiffness",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "JointSetStiffness",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("state", "")
//    )
//
//    void(
//        "DestroyJoint",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "JointSetDestructor",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        NewtonConstraintDestructor("destructor", "")
//    )
//
//    int(
//        "JointIsActive",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    NewtonInverseDynamics.p(
//        "CreateInverseDynamics",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    void(
//        "InverseDynamicsDestroy",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", "")
//    )
//
//    void.p(
//        "InverseDynamicsGetRoot",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", "")
//    )
//
//    void.p(
//        "InverseDynamicsGetNextChildNode",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("node", "")
//    )
//
//    void.p(
//        "InverseDynamicsGetFirstChildNode",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("parentNode", "")
//    )
//
//    NewtonBody.p(
//        "InverseDynamicsGetBody",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("node", "")
//    )
//
//    NewtonJoint.p(
//        "InverseDynamicsGetJoint",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("node", "")
//    )
//
//    NewtonJoint.p(
//        "InverseDynamicsCreateEffector",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("node", ""),
//        NewtonUserBilateralCallback("callback", "")
//    )
//
//    void(
//        "InverseDynamicsDestroyEffector",
//        "",
//
//        NewtonJoint.p.const("effector", "")
//    )
//
//    void.p(
//        "InverseDynamicsAddRoot",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        NewtonBody.p.const("root", "")
//    )
//
//    void.p(
//        "InverseDynamicsAddChildNode",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        void.p.const("parentNode", ""),
//        NewtonJoint.p.const("joint", "")
//    )
//
//    bool(
//        "InverseDynamicsAddLoopJoint",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        NewtonJoint.p.const("joint", "")
//    )
//
//    void(
//        "InverseDynamicsEndBuild",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", "")
//    )
//
//    void(
//        "InverseDynamicsUpdate",
//        "",
//
//        NewtonInverseDynamics.p.const("inverseDynamics", ""),
//        float("timestep", ""),
//        int("threadIndex", "")
//    )
//
//    NewtonCollision.p(
//        "CreateMassSpringDamperSystem",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("shapeID", ""),
//        float.const.p.const("points", ""),
//        int("pointCount", ""),
//        int("strideInBytes", ""),
//        float.const.p.const("pointMass", ""),
//        int.const.p.const("links", ""),
//        int("linksCount", ""),
//        float.const.p.const("linksSpring", ""),
//        float.const.p.const("linksDamper", "")
//    )
//
//    NewtonCollision.p(
//        "CreateDeformableSolid",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonMesh.const.p.const("mesh", ""),
//        int("shapeID", "")
//    )
//
//    int(
//        "DeformableMeshGetParticleCount",
//        "",
//
//        NewtonCollision.const.p.const("deformableMesh", "")
//    )
//
//    int(
//        "DeformableMeshGetParticleStrideInBytes",
//        "",
//
//        NewtonCollision.const.p.const("deformableMesh", "")
//    )
//
//    float.const.p(
//        "DeformableMeshGetParticleArray",
//        "",
//
//        NewtonCollision.const.p.const("deformableMesh", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateBall",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pivotPoint", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    void(
//        "BallSetUserCallback",
//        "",
//
//        NewtonJoint.const.p.const("ball", ""),
//        NewtonBallCallback("callback", "")
//    )
//
//    void(
//        "BallGetJointAngle",
//        "",
//
//        NewtonJoint.const.p.const("ball", ""),
//        float.p("angle", "")
//    )
//
//    void(
//        "BallGetJointOmega",
//        "",
//
//        NewtonJoint.const.p.const("ball", ""),
//        float.p("omega", "")
//    )
//
//    void(
//        "BallGetJointForce",
//        "",
//
//        NewtonJoint.const.p.const("ball", ""),
//        float.p.const("force", "")
//    )
//
//    void(
//        "BallSetConeLimits",
//        "",
//
//        NewtonJoint.const.p.const("ball", ""),
//        float.const.p("pin", ""),
//        float("maxConeAngle", ""),
//        float("maxTwistAngle", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateHinge",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pivotPoint", ""),
//        float.const.p("pinDir", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    void(
//        "HingeSetUserCallback",
//        "",
//
//        NewtonJoint.const.p.const("hinge", ""),
//        NewtonHingeCallback("callback", "")
//    )
//
//    float(
//        "HingeGetJointAngle",
//        "",
//
//        NewtonJoint.const.p.const("hinge", "")
//    )
//
//    float(
//        "HingeGetJointOmega",
//        "",
//
//        NewtonJoint.const.p.const("hinge", "")
//    )
//
//    void(
//        "HingeGetJointForce",
//        "",
//
//        NewtonJoint.const.p.const("hinge", ""),
//        float.p.const("force", "")
//    )
//
//    float(
//        "HingeCalculateStopAlpha",
//        "",
//
//        NewtonJoint.const.p.const("hinge", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("angle", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateSlider",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pivotPoint", ""),
//        float.const.p("pinDir", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    void(
//        "SliderSetUserCallback",
//        "",
//
//        NewtonJoint.const.p.const("slider", ""),
//        NewtonSliderCallback("callback", "")
//    )
//
//    float(
//        "SliderGetJointPosit",
//        "",
//
//        NewtonJoint.const.p("slider", "")
//    )
//
//    float(
//        "SliderGetJointVeloc",
//        "",
//
//        NewtonJoint.const.p("slider", "")
//    )
//
//    void(
//        "SliderGetJointForce",
//        "",
//
//        NewtonJoint.const.p.const("slider", ""),
//        float.p.const("force", "")
//    )
//
//    float(
//        "SliderCalculateStopAccel",
//        "",
//
//        NewtonJoint.const.p.const("slider", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("position", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateCorkscrew",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pivotPoint", ""),
//        float.const.p("pinDir", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    void(
//        "CorkscrewSetUserCallback",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", ""),
//        NewtonCorkscrewCallback("callback", "")
//    )
//
//    float(
//        "CorkscrewGetJointPosit",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", "")
//    )
//
//    float(
//        "CorkscrewGetJointAngle",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", "")
//    )
//
//    float(
//        "CorkscrewGetJointVeloc",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", "")
//    )
//
//    float(
//        "CorkscrewGetJointOmega",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", "")
//    )
//
//    void(
//        "CorkscrewGetJointForce",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", ""),
//        float.p.const("force", "")
//    )
//
//    float(
//        "CorkscrewCalculateStopAlpha",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("angle", "")
//    )
//
//    float(
//        "CorkscrewCalculateStopAccel",
//        "",
//
//        NewtonJoint.const.p.const("corkscrew", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("position", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateUniversal",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pivotPoint", ""),
//        float.const.p("pinDir0", ""),
//        float.const.p("pinDir1", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    void(
//        "UniversalSetUserCallback",
//        "",
//
//        NewtonJoint.const.p.const("universal", ""),
//        NewtonUniversalCallback("callback", "")
//    )
//
//    float(
//        "UniversalGetJointAngle0",
//        "",
//
//        NewtonJoint.const.p.const("universal", "")
//    )
//
//    float(
//        "UniversalGetJointAngle1",
//        "",
//
//        NewtonJoint.const.p.const("universal", "")
//    )
//
//    float(
//        "UniversalGetJointOmega0",
//        "",
//
//        NewtonJoint.const.p.const("universal", "")
//    )
//
//    float(
//        "UniversalGetJointOmega1",
//        "",
//
//        NewtonJoint.const.p.const("universal", "")
//    )
//
//    void(
//        "UniversalGetJointForce",
//        "",
//
//        NewtonJoint.const.p.const("universal", ""),
//        float.p.const("force", "")
//    )
//
//    float(
//        "UniversalCalculateStopAlpha0",
//        "",
//
//        NewtonJoint.const.p.const("universal", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("angle", "")
//    )
//
//    float(
//        "UniversalCalculateStopAlpha1",
//        "",
//
//        NewtonJoint.const.p.const("universal", ""),
//        NewtonHingeSliderUpdateDesc.const.p.const("desc", ""),
//        float("angle", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateUpVector",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        float.const.p("pinDir", ""),
//        NewtonBody.const.p.const("body", "")
//    )
//
//    void(
//        "UpVectorGetPin",
//        "",
//
//        NewtonJoint.const.p.const("upVector", ""),
//        float.p("pin", "")
//    )
//
//    void(
//        "UpVectorSetPin",
//        "",
//
//        NewtonJoint.const.p.const("upVector", ""),
//        float.const.p("pin", "")
//    )
//
//    NewtonJoint.p(
//        "ConstraintCreateUserJoint",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("maxDOF", ""),
//        NewtonUserBilateralCallback("callback", ""),
//        NewtonBody.const.p.const("childBody", ""),
//        NewtonBody.const.p.const("parentBody", "")
//    )
//
//    int(
//        "UserJointGetSolverModel",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "UserJointSetSolverModel",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        int("model", "")
//    )
//
//    void(
//        "UserJointSetFeedbackCollectorCallback",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        NewtonUserBilateralCallback("getFeedback", "")
//    )
//
//    void(
//        "UserJointAddLinearRow",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float.const.p.const("pivot0", ""),
//        float.const.p.const("pivot1", ""),
//        float.const.p.const("dir", "")
//    )
//
//    void(
//        "UserJointAddAngularRow",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("relativeAngle", ""),
//        float.const.p.const("dir", "")
//    )
//
//    void(
//        "UserJointAddGeneralRow",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float.const.p.const("jacobian0", ""),
//        float.const.p.const("jacobian1", "")
//    )
//
//    void(
//        "UserJointSetRowMinimumFriction",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("friction", "")
//    )
//
//    void(
//        "UserJointSetRowMaximumFriction",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("friction", "")
//    )
//
//    float(
//        "UserJointCalculateRowZeroAccelaration",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    float(
//        "UserJointGetRowAcceleration",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "UserJointSetRowAsInverseDynamics",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "UserJointSetRowAcceleration",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("acceleration", "")
//    )
//
//    void(
//        "UserJointSetRowSpringDamperAcceleration",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("rowStiffness", ""),
//        float("spring", ""),
//        float("damper", "")
//    )
//
//    void(
//        "UserJointSetRowStiffness",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        float("stiffness", "")
//    )
//
//    int(
//        "UserJoinRowsCount",
//        "",
//
//        NewtonJoint.const.p.const("joint", "")
//    )
//
//    void(
//        "UserJointGetGeneralRow",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        int("index", ""),
//        float.p.const("jacobian0", ""),
//        float.p.const("jacobian1", "")
//    )
//
//    float(
//        "UserJointGetRowForce",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        int("row", "")
//    )
//
//    int(
//        "UserJointSubmitImmediateModeConstraint",
//        "",
//
//        NewtonJoint.const.p.const("joint", ""),
//        NewtonConstraintDescriptor.p.const("descriptor", ""),
//        float("timestep", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreate",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateFromMesh",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateFromCollision",
//        "",
//
//        NewtonCollision.const.p.const("collision", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateTetrahedraIsoSurface",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateConvexHull",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("pointCount", ""),
//        float.const.p.const("vertexCloud", ""),
//        int("strideInBytes", ""),
//        float("tolerance", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateVoronoiConvexDecomposition",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        int("pointCount", ""),
//        float.const.p.const("vertexCloud", ""),
//        int("strideInBytes", ""),
//        int("materialID", ""),
//        float.const.p.const("textureMatrix", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateFromSerialization",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        NewtonDeserializeCallback("deserializeFunction", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    void(
//        "MeshDestroy",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshSerialize",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonSerializeCallback("serializeFunction", ""),
//        void.p.const("serializeHandle", "")
//    )
//
//    void(
//        "MeshSaveOFF",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        char.const.p.const("filename", "")
//    )
//
//    NewtonMesh.p(
//        "MeshLoadOFF",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("filename", "")
//    )
//
//    NewtonMesh.p(
//        "MeshLoadTetrahedraMesh",
//        "",
//
//        NewtonWorld.const.p.const("newtonWorld", ""),
//        char.const.p.const("filename", "")
//    )
//
//    void(
//        "MeshApplyTransform",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float.const.p.const("matrix", "")
//    )
//
//    void(
//        "MeshCalculateOOBB",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float.p.const("matrix", ""),
//        float.p.const("x", ""),
//        float.p.const("y", ""),
//        float.p.const("z", "")
//    )
//
//    void(
//        "MeshCalculateVertexNormals",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("angleInRadians", "")
//    )
//
//    void(
//        "MeshApplySphericalMapping",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("material", ""),
//        float.const.p.const("aligmentMatrix", "")
//    )
//
//    void(
//        "MeshApplyCylindricalMapping",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("cylinderMaterial", ""),
//        int("capMaterial", ""),
//        float.const.p.const("aligmentMatrix", "")
//    )
//
//    void(
//        "MeshApplyBoxMapping",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("frontMaterial", ""),
//        int("sideMaterial", ""),
//        int("topMaterial", ""),
//        float.const.p.const("aligmentMatrix", "")
//    )
//
//    void(
//        "MeshApplyAngleBasedMapping",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("material", ""),
//        NewtonReportProgress("reportPrograssCallback", ""),
//        void.p.const("reportPrgressUserData", ""),
//        float.p.const("aligmentMatrix", "")
//    )
//
//    void(
//        "CreateTetrahedraLinearBlendSkinWeightsChannel",
//        "",
//
//        NewtonMesh.const.p.const("tetrahedraMesh", ""),
//        NewtonMesh.p.const("skinMesh", "")
//    )
//
//    void(
//        "MeshOptimize",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshOptimizePoints",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshOptimizeVertex",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshIsOpenMesh",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshFixTJoints",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshPolygonize",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshTriangulate",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshUnion",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("clipper", ""),
//        float.const.p.const("clipperMatrix", "")
//    )
//
//    NewtonMesh.p(
//        "MeshDifference",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("clipper", ""),
//        float.const.p.const("clipperMatrix", "")
//    )
//
//    NewtonMesh.p(
//        "MeshIntersection",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("clipper", ""),
//        float.const.p.const("clipperMatrix", "")
//    )
//
//    void(
//        "MeshClip",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("clipper", ""),
//        float.const.p.const("clipperMatrix", ""),
//        NewtonMesh.p.p.const("topMesh", ""),
//        NewtonMesh.p.p.const("bottomMesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshConvexMeshIntersection",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("convexMesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshSimplify",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("maxVertexCount", ""),
//        NewtonReportProgress("reportPrograssCallback", ""),
//        void.p.const("reportPrgressUserData", "")
//    )
//
//    NewtonMesh.p(
//        "MeshApproximateConvexDecomposition",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("maxConcavity", ""),
//        float("backFaceDistanceFactor", ""),
//        int("maxCount", ""),
//        int("maxVertexPerHull", ""),
//        NewtonReportProgress("reportProgressCallback", ""),
//        void.p.const("reportProgressUserData", "")
//    )
//
//    void(
//        "RemoveUnusedVertices",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int.p.const("vertexRemapTable", "")
//    )
//
//    void(
//        "MeshBeginBuild",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshBeginFace",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshAddPoint",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        double("x", ""),
//        double("y", ""),
//        double("z", "")
//    )
//
//    void(
//        "MeshAddLayer",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("layerIndex", "")
//    )
//
//    void(
//        "MeshAddMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("materialIndex", "")
//    )
//
//    void(
//        "MeshAddNormal",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("x", ""),
//        float("y", ""),
//        float("z", "")
//    )
//
//    void(
//        "MeshAddBinormal",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("x", ""),
//        float("y", ""),
//        float("z", "")
//    )
//
//    void(
//        "MeshAddUV0",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("u", ""),
//        float("v", "")
//    )
//
//    void(
//        "MeshAddUV1",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("u", ""),
//        float("v", "")
//    )
//
//    void(
//        "MeshAddVertexColor",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        float("r", ""),
//        float("g", ""),
//        float("b", ""),
//        float("a", "")
//    )
//
//    void(
//        "MeshAddVertexWeight",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        Check(4)..int.p("matrixIndex", ""),
//        Check(4)..float.p("weights", "")
//    )
//
//    void(
//        "MeshEndFace",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshEndBuild",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshClearVertexFormat",
//        "",
//
//        NewtonMeshVertexFormat.p.const("format", "")
//    )
//
//    void(
//        "MeshBuildFromVertexListIndexList",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMeshVertexFormat.const.p.const("format", "")
//    )
//
//    int(
//        "MeshGetPointCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int.const.p(
//        "MeshGetIndexToVertexMap",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshGetVertexDoubleChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        double.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetVertexChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetWeightBlendsChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetWeightBoneIndexChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        int.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetNormalChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetBinormalChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetUV0Channel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetUV1Channel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    void(
//        "MeshGetVertexColorChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int("vertexStrideInByte", ""),
//        float.p.const("outBuffer", "")
//    )
//
//    int(
//        "MeshHasNormalChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshHasVertexWeightChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshHasBinormalChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshHasUV0Channel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshHasUV1Channel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshHasVertexColorChannel",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshBeginHandle",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshEndHandle",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", "")
//    )
//
//    int(
//        "MeshFirstMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", "")
//    )
//
//    int(
//        "MeshNextMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", ""),
//        int("materialId", "")
//    )
//
//    int(
//        "MeshMaterialGetMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", ""),
//        int("materialId", "")
//    )
//
//    int(
//        "MeshMaterialGetIndexCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", ""),
//        int("materialId", "")
//    )
//
//    void(
//        "MeshMaterialGetIndexStream",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", ""),
//        int("materialId", ""),
//        int.p.const("index", "")
//    )
//
//    void(
//        "MeshMaterialGetIndexStreamShort",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.p.const("handle", ""),
//        int("materialId", ""),
//        short.p.const("index", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateFirstSingleSegment",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateNextSingleSegment",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("segment", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateFirstLayer",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    NewtonMesh.p(
//        "MeshCreateNextLayer",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        NewtonMesh.const.p.const("segment", "")
//    )
//
//    int(
//        "MeshGetTotalFaceCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshGetTotalIndexCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void(
//        "MeshGetFaces",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        int.p.const("faceIndexCount", ""),
//        int.p.const("faceMaterial", ""),
//        void.p.p.const("faceIndices", "")
//    )
//
//    int(
//        "MeshGetVertexCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    int(
//        "MeshGetVertexStrideInByte",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    double.const.p(
//        "MeshGetVertexArray",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshGetFirstVertex",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshGetNextVertex",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("vertex", "")
//    )
//
//    int(
//        "MeshGetVertexIndex",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("vertex", "")
//    )
//
//    void.p(
//        "MeshGetFirstPoint",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshGetNextPoint",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("point", "")
//    )
//
//    int(
//        "MeshGetPointIndex",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("point", "")
//    )
//
//    int(
//        "MeshGetVertexIndexFromPoint",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("point", "")
//    )
//
//    void.p(
//        "MeshGetFirstEdge",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshGetNextEdge",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("edge", "")
//    )
//
//    void(
//        "MeshGetEdgeIndices",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("edge", ""),
//        int.p.const("v0", ""),
//        int.p.const("v1", "")
//    )
//
//    void.p(
//        "MeshGetFirstFace",
//        "",
//
//        NewtonMesh.const.p.const("mesh", "")
//    )
//
//    void.p(
//        "MeshGetNextFace",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", "")
//    )
//
//    int(
//        "MeshIsFaceOpen",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", "")
//    )
//
//    int(
//        "MeshGetFaceMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", "")
//    )
//
//    int(
//        "MeshGetFaceIndexCount",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", "")
//    )
//
//    void(
//        "MeshGetFaceIndices",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", ""),
//        int.p.const("indices", "")
//    )
//
//    void(
//        "MeshGetFacePointIndices",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", ""),
//        int.p.const("indices", "")
//    )
//
//    void(
//        "MeshCalculateFaceNormal",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", ""),
//        double.p.const("normal", "")
//    )
//
//    void(
//        "MeshSetFaceMaterial",
//        "",
//
//        NewtonMesh.const.p.const("mesh", ""),
//        void.const.p.const("face", ""),
//        int("matId", "")
//    )
}