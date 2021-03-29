import React, { Component } from "react";
import styled, { css } from "styled-components";
import CupertinoButtonInfo1 from "../components/CupertinoButtonInfo1";
import CupertinoButtonInfo from "../components/CupertinoButtonInfo";
import MaterialUnderlineTextbox from "../components/MaterialUnderlineTextbox";
import Username from "../components/Username";
import CupertinoSegmentWithThreeTabs2 from "../components/CupertinoSegmentWithThreeTabs2";

function Home1(props) {
  return (
    <>
      <ImageRow>
        <Image
          src={require("../assets/images/florida-gators-logo-black-and-white.png")}
        ></Image>
        <CupertinoButtonInfo1Column>
          <CupertinoButtonInfo1
            style={{
              height: 79,
              width: 244
            }}
          ></CupertinoButtonInfo1>
          <LoremIpsum>Don&#39;t have an account yet?</LoremIpsum>
          <CupertinoButtonInfo
            style={{
              height: 79,
              width: 244,
              marginTop: 24
            }}
          ></CupertinoButtonInfo>
        </CupertinoButtonInfo1Column>
      </ImageRow>
      <NVisionRow>
        <NVision>NVision</NVision>
        <MaterialUnderlineTextboxColumn>
          <MaterialUnderlineTextbox
            style={{
              height: 43,
              width: 360
            }}
          ></MaterialUnderlineTextbox>
          <Username
            style={{
              height: 43,
              width: 360,
              marginTop: 52
            }}
          ></Username>
        </MaterialUnderlineTextboxColumn>
      </NVisionRow>
      <TextStack>
        <Text>Home</Text>
        <CupertinoSegmentWithThreeTabs2
          style={{
            height: 56,
            position: "absolute",
            top: 0,
            width: 1366,
            left: 0
          }}
        ></CupertinoSegmentWithThreeTabs2>
      </TextStack>
    </>
  );
}

const Image = styled.img`
  width: 100%;
  height: 348px;
  object-fit: contain;
`;

const LoremIpsum = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: #121212;
  font-size: 25px;
  margin-top: 72px;
`;

const CupertinoButtonInfo1Column = styled.div`
  width: 298px;
  flex-direction: column;
  display: flex;
  margin-left: 215px;
  margin-top: 64px;
`;

const ImageRow = styled.div`
  height: 348px;
  flex-direction: row;
  display: flex;
  margin-top: 320px;
  margin-left: 169px;
  margin-right: 226px;
`;

const NVision = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(3,10,57,1);
  font-size: 144px;
`;

const MaterialUnderlineTextboxColumn = styled.div`
  width: 360px;
  flex-direction: column;
  display: flex;
  margin-left: 190px;
  margin-top: 65px;
`;

const NVisionRow = styled.div`
  height: 203px;
  flex-direction: row;
  display: flex;
  margin-top: -551px;
  margin-left: 144px;
  margin-right: 164px;
`;

const Text = styled.span`
  font-family: Roboto;
  top: 0px;
  left: 130px;
  position: absolute;
  font-style: normal;
  font-weight: 400;
  color: rgba(255,255,255,1);
  font-size: 20px;
`;

const TextStack = styled.div`
  width: 1366px;
  height: 56px;
  margin-top: -316px;
  position: relative;
`;

export default Home1;
