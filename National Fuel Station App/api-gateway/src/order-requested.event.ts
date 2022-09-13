export class OrderRequestedEvent{
    constructor(
        public readonly stationId:string,
        public readonly requestQty:number,
        public readonly fuelType:string,
        public readonly requestDate:Date
    ){}

    toString(){
        return JSON.stringify({
            stationId: this.stationId,
            fuelType:this.fuelType,
            requestQty: this.requestQty,
            requestDate: this.requestDate
        });
    }
}