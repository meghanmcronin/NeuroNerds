# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# compile CXX with /usr/bin/c++
CXX_FLAGS =   -msse2  

CXX_DEFINES = -DITK_IO_FACTORY_REGISTER_MANAGER -DNDEBUG -D_GNU_SOURCE

CXX_INCLUDES = -I/home/tkhanal/Desktop/NSG-Patient-Anatomy-App/TK_Ubuntu/DICOM_test/build/ITKFactoryRegistration -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Bridge/VtkGlue/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Video/IO/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Video/Filtering/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Video/Core/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/TestKernel/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/SuperPixel/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Nonunit/Review/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/Watersheds/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Bridge/VTK/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/SpatialFunction/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/RegistrationMethodsv4/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/RegionGrowing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/QuadEdgeMeshFiltering/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/Metricsv4/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/Optimizersv4/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/MarkovRandomFieldsClassifiers/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/LevelSetsv4/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/LabelVoting/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/libLBFGS/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/KLMRegionGrowing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageNoise/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageFusion/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageFrequency/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/VTK/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TransformMatlab/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TransformInsightLegacy/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TransformHDF5/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TransformBase/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TransformFactory/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/Stimulate/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/SpatialObjects/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/XML/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/Siemens/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/RAW/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/PNG/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/PNG/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/PNG/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/NRRD/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/NrrdIO/src/NrrdIO -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/NrrdIO/src/NrrdIO -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/NIFTI/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/Meta/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/Mesh/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshVTK/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshOFF/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshOBJ/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshGifti/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshFreeSurfer/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshBYU/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MeshBase/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/Voronoi/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MRC/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/MINC/include -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/HDF5/src/itkhdf5 -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/HDF5/src/itkhdf5 -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MINC/src/libminc/volume_io/Include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MINC/src/libminc/libsrc2 -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MINC/src/libminc/libcommon -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MINC/src/libminc -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MINC -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/MINC -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/LSM/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/TIFF/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/TIFF/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/TIFF/src/itktiff -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/TIFF/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/JPEG2000/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/OpenJPEG/src/openjpeg -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/OpenJPEG/src/openjpeg -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/JPEG/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/JPEG/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/JPEG/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/HDF5/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/GIPL/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/GE/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/IPL/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/GDCM/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/CSV/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/Bruker/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/BioRad/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/BMP/include -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/HDF5/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/HDF5/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/GPUThresholding/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/GPUSmoothing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/GPUPDEDeformable/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/PDEDeformable/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/Common/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Registration/GPUCommon/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/GPUImageFilterBase/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/GPUAnisotropicSmoothing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/GPUFiniteDifference/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/GPUCommon/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GIFTI/src/gifticlib -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/DataStructureAndEncodingDefinition -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/MessageExchangeDefinition -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/InformationObjectDefinition -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/Common -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/DataDictionary -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/GDCM/src/gdcm/Source/MediaStorageAndFileFormat -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/GDCM/src/gdcm/Source/Common -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/GDCM -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/Expat/src/expat -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/Expat/src/expat -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/Eigen/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/DisplacementField/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/DiffusionTensorImage/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Denoising/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/DeformableMesh/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Deconvolution/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/DICOMParser/src/DICOMParser -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/DICOMParser/src/DICOMParser -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Convolution/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/FFT/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Colormap/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/Classifiers/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/BiasCorrection/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/Polynomials/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/AntiAlias/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/LevelSets/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/SignedDistanceFunction/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/Optimizers/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageFeature/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageSources/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageGradient/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Smoothing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageCompare/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/IO/ImageBase/include -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/IO/ImageBase -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/FastMarching/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/QuadEdgeMesh/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/DistanceMap/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/NarrowBand/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/BinaryMathematicalMorphology/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/MathematicalMorphology/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Segmentation/ConnectedComponents/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Thresholding/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/LabelMap/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageLabel/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageIntensity/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/Path/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageStatistics/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/SpatialObjects/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/MetaIO/src/MetaIO/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/MetaIO/src/MetaIO/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/ZLIB/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/ZLIB/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/Mesh/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageCompose/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/AnisotropicSmoothing/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageGrid/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/ImageFunction/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/Transform/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Numerics/Statistics/include -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/Netlib -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/ImageAdaptors/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/CurvatureFlow/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Filtering/ImageFilterBase/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/FiniteDifference/include -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/Core/Common/include -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/Core/Common -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/VNL/src/vxl/core -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/VNL/src/vxl/vcl -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/VNL/src/vxl/v3p/netlib -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/VNL/src/vxl/core -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/KWIML/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/KWIML/src -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/Eigen3/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/Eigen3/src -I/usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/DoubleConversion/src/double-conversion -I/home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/DoubleConversion/src -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/HDF5/src/itkhdf5/src -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/NIFTI/src/nifti/znzlib -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/NIFTI/src/nifti/niftilib -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/VNL/src/vxl/vcl -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/VNL/src/vxl/v3p/netlib -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/KWSys/src -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/Eigen3/src/itkeigen/.. -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/Eigen3/src/itkeigen/.. -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/VNL/src/vxl/core/vnl/algo -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/VNL/src/vxl/core/vnl -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/NIFTI/src/nifti/znzlib -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/NIFTI/src/nifti/niftilib -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/HDF5/src/itkhdf5/c++/src -isystem /home/tkhanal/Downloads/InsightToolkit-5.0.1/Modules/ThirdParty/HDF5/src/itkhdf5/c++/src -isystem /usr/local/itk/InsightToolkit-5.0.1/bin/Modules/ThirdParty/HDF5/src/itkhdf5/src -isystem /usr/local/include/vtk-8.90 

