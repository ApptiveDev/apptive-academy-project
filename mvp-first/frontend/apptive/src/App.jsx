import "@css/App.css";
import Buttons from "./components/buttons/buttons";
import Input from "./components/input/input";

function App() {
  return (
    <>
      <div className="App">
        <div className="title">협력사 이름</div>
        <div className="form">
          <div className="form_text">
            <div className="form_title">고객 정보 조회</div>
            <div className="form_detail">
              이름과 전화번호를 통해 AS 정보를 불러올 수 있어요
            </div>
          </div>
          <div className="input_box">
            <Input placeholder="이름" />
            <Input placeholder="전화번호" />
          </div>
          <Buttons />
        </div>
        <div className="background_text">APPTIVE</div>
      </div>
    </>
  );
}

export default App;
