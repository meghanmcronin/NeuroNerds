cmake_minimum_required(VERSION 3.19.3)

set(LIB_DIR ${PROJECT_SOURCE_DIR}/lib/${ANDROID_ABI})

add_library(vtk-common-color STATIC IMPORTED)
set_target_properties(vtk-common-color
    PROPERTIES IMPORTED_LOCATION
    ${LIB_DIR}/libvtkCommonColor-8.90.a)

#53 more libraries from lib folder

add_library( vtk-lib SHARED ${PROJECT_SOURCE_DIR}/vtk-lib.cpp)

target_include_directories(vtk-lib PRIVATE ${PROJECT_SOURCE_DIR}/include)

target_link_libraries(
    vtk-lib
    -Wl,--start-group -L ${TARGET_OUT}
    vtk-common-color
    #53 more libraries names
    -Wl,--end-group
)