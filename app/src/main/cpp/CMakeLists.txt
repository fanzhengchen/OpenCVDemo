
cmake_minimum_required(VERSION 3.4.1)


add_library( native-lib

             SHARED

             native-lib.cpp )


find_library( log-lib

              log )

include_directories(${CMAKE_SOURCE_DIR}/include)


set(lib_dir ${CMAKE_SOURCE_DIR}/../native/libs/${ANDROID_ABI})

add_library(opencv_calib3d STATIC IMPORTED)
set_target_properties(opencv_calib3d PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_calib3d.a)

add_library(opencv_core STATIC IMPORTED)
set_target_properties(opencv_core PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_core.a)

add_library(opencv_features2d STATIC IMPORTED)
set_target_properties(opencv_features2d PROPERTIES IMPORTED_LOCATION ${lib_dir}/slibopencv_features2d.a)

add_library(opencv_flann STATIC IMPORTED)
set_target_properties(opencv_flann PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_flann.a)

add_library(opencv_highgui STATIC IMPORTED)
set_target_properties(opencv_highgui PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_highgui.a)

add_library(opencv_imgcodecs STATIC IMPORTED)
set_target_properties(opencv_imgcodecs PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_imgcodecs.a)

add_library(opencv_imgproc STATIC IMPORTED)
set_target_properties(opencv_imgproc PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_imgproc.a)

add_library(opencv_java3 SHARED IMPORTED)
set_target_properties(opencv_java3 PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_java3.so)

add_library(opencv_ml STATIC IMPORTED)
set_target_properties(opencv_ml PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_ml.a)

add_library(opencv_objdetect STATIC IMPORTED)
set_target_properties(opencv_objdetect PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_objdetect.a)

add_library(opencv_photo STATIC IMPORTED)
set_target_properties(opencv_photo PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_photo.a)

add_library(opencv_shape STATIC  IMPORTED)
set_target_properties(opencv_shape PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_shape.a)

add_library(opencv_stitching STATIC IMPORTED)
set_target_properties(opencv_stitching PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_stitching.a)

add_library(opencv_superres STATIC IMPORTED)
set_target_properties(opencv_superres PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_superres.a)

add_library(opencv_video STATIC IMPORTED)
set_target_properties(opencv_video PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_video.a)

add_library(opencv_videoio STATIC IMPORTED)
set_target_properties(opencv_videoio PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_videoio.a)

add_library(opencv_videostab STATIC IMPORTED)
set_target_properties(opencv_videostab PROPERTIES IMPORTED_LOCATION ${lib_dir}/libopencv_videostab.a)

target_link_libraries( native-lib
                       ${log-lib} )