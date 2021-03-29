import React, { Component } from "react";
import styled, { css } from "styled-components";
import MaterialCommunityIconsIcon from "react-native-vector-icons/dist/MaterialCommunityIcons";

function MaterialHeader1(props) {
  return (
    <Container {...props}>
      <LeftIconButtonRow>
        <LeftIconButton>
          <ButtonOverlay>
            <MaterialCommunityIconsIcon
              name="menu"
              style={{
                backgroundColor: "transparent",
                color: "#FFFFFF",
                fontSize: 49
              }}
            ></MaterialCommunityIconsIcon>
          </ButtonOverlay>
        </LeftIconButton>
        <TextWrapperStack>
          <TextWrapper></TextWrapper>
          <NVision>NVision</NVision>
        </TextWrapperStack>
      </LeftIconButtonRow>
      <LeftIconButtonRowFiller></LeftIconButtonRowFiller>
      <RightIconButton>
        <ButtonOverlay>
          <MaterialCommunityIconsIcon
            name="dots-vertical"
            style={{
              backgroundColor: "transparent",
              color: "#FFFFFF",
              fontSize: 47
            }}
          ></MaterialCommunityIconsIcon>
        </ButtonOverlay>
      </RightIconButton>
    </Container>
  );
}

const Container = styled.div`
  display: flex;
  background-color: #3F51B5;
  flex-direction: row;
  align-items: center;
  padding: 4px;
  justify-content: space-between;
  box-shadow: 0px 2px 1.2px  0.2px #111 ;
`;

const ButtonOverlay = styled.button`
 display: block;
 background: none;
 height: 100%;
 width: 100%;
 border:none
 `;
const LeftIconButton = styled.div`
  padding: 11px;
  flex-direction: column;
  display: flex;
  border: none;
`;

const TextWrapper = styled.div`
  position: absolute;
  left: 13px;
  bottom: 15px;
`;

const NVision = styled.span`
  font-family: Roboto;
  top: 0px;
  left: 0px;
  position: absolute;
  font-style: normal;
  font-weight: 700;
  color: #121212;
  font-size: 46px;
`;

const TextWrapperStack = styled.div`
  width: 156px;
  height: 53px;
  margin-left: 42px;
  margin-top: 10px;
  position: relative;
`;

const LeftIconButtonRow = styled.div`
  height: 63px;
  flex-direction: row;
  margin-left: -5px;
  margin-top: -11px;
  display: flex;
`;

const LeftIconButtonRowFiller = styled.div`
  flex: 1 1 0%;
  flex-direction: row;
  display: flex;
`;

const RightIconButton = styled.div`
  padding: 11px;
  align-items: center;
  flex-direction: column;
  display: flex;
  margin-right: -12px;
  margin-top: -11px;
  border: none;
`;

export default MaterialHeader1;
